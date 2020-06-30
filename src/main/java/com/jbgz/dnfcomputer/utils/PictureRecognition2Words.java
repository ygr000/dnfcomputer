package com.jbgz.dnfcomputer.utils;

import com.baidu.aip.ocr.AipOcr;
import com.jbgz.dnfcomputer.controller.EquipController;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * @Location:com.jbgz.dnfcomputer.utils
 * @Auth:ygr
 * @DATE:2020/6/30 10:59
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
 */
@Component
public class PictureRecognition2Words {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${AppID}")
    private String APP_ID;
    @Value("${ApiKey}")
    private String API_KEY;
    @Value("${SecretKey}")
    private String SECRET_KEY;
    private  AipOcr client=null;
    // 初始化用户对象
    public AipOcr init() {
        // 初始化一个AipOcr
        if(client==null) {
             client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        }else {
            return this.client;
        }
        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);
        return client;
    }

    public  String getPictureWords(String url) {
        init();
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("paragraph", "false");
        options.put("probability", "false");
        // 参数为本地图片路径
        JSONObject res;
        if(url.indexOf("http")==0){
            res=client.basicGeneralUrl(url,options);
        }else {
            res = client.basicAccurateGeneral(url, options);
        }
        return res.toString();
    }

}
