package com.jbgz.dnfcomputer.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Aspect
@Component
public class SysLogAspect {
    private static final ThreadLocal<Long> beginTimeThreadLocal = new NamedThreadLocal<>("beginTime");
    private static final Logger log = LoggerFactory.getLogger(SysLogAspect.class);
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Pointcut("@annotation(com.jbgz.dnfcomputer.aop.SysLog)")
    public void LogAspect() {

    }


    /**
     * 前置通知 (在方法执行之前返回)用于拦截Controller层记录用户的操作的开始时间
     *
     * @param joinPoint 切点
     * @throws InterruptedException
     */
    @Before("LogAspect()")
    public void doBefore(JoinPoint joinPoint) throws InterruptedException {
        Long beforeSecond = System.currentTimeMillis();

        //获取当前方法上注解的值
        SysLog sysLog = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(SysLog.class);
        //获取当前方法参数
        Object[] args = joinPoint.getArgs();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String method = joinPoint.getSignature().getName();
        beginTimeThreadLocal.set(beforeSecond);
        Thread thread = Thread.currentThread();
        log.info("公共日志-开始-当前线程{}\n--类:{} \n--方法:{}\n--方法上注解{}\n--传入参数数组{}", thread.getName(), className, method, sysLog.value(), Arrays.toString(args));
    }

    @After("LogAspect()")
    public void after(JoinPoint joinPoint) {
        Thread thread = Thread.currentThread();
        Long beforeSecond = beginTimeThreadLocal.get();
        Long afterSecond = System.currentTimeMillis();
        Long spendTime = (afterSecond - beforeSecond) / 1000;
        log.info("公共日志-结束-当前线程{}--- 消耗时间 {}s", thread.getName(), spendTime);

    }

    public static Object judgeArg(Object arg) {

        String argStr = JSON.toJSONString(arg);
        arg = new JSONTokener(argStr).nextValue();
        if (arg instanceof org.json.JSONArray) {
            for (int i = 0; i < ((JSONArray) arg).length(); i++) {
                ((JSONArray) arg).put(i, judgeArg(((JSONArray) arg).get(i)));
            }

        } else if (arg instanceof org.json.JSONObject) {
            for (String key : ((JSONObject) arg).keySet()) {
                ((JSONObject) arg).put(key, judgeArg(((JSONObject) arg).get(key)));
            }
        } else {
            arg = arg + "_加密";
        }
        return arg;
    }

    public static void main(String[] args) {
        List<HashMap<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("key_" + i, "value_" + i);
            list.add(hashMap);
        }
        log.info(judgeArg(list).toString());

    }
}
