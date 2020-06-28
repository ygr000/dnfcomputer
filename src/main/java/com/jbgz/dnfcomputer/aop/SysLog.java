package com.jbgz.dnfcomputer.aop;

import java.lang.annotation.*;

/**
 * @Location:com.jbgz.dnfcomputer.aop
 * @Auth:ygr
 * @DATE:2020/6/27 13:16
 * <p>
 * .                ,]++++++++]`
 * .              ]++o**=++++++++\`
 * .          ,+++++++o\]**[*=++++\
 * .         ++++++++++++++++oo++++^
 * .        =+++++++++++++++++++++++
 * .       =+/`,++o++oo++++++++++++++\
 * .        + +\++\****\++=+++++++\++++
 * .           \\ \\//`*]o+++++oo/ /+++`
 * .           ,+`   [\++++++[`,[+\=+++^
 * .           +`        ++]]++    ,++^
 * .          =+         \`         +[
 * .           +`         ,+`
 * .            +`  ]/+++++\/+
 * .             =+]=^
 * .            *,[[
 * <p>
 * 自定义注释
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
