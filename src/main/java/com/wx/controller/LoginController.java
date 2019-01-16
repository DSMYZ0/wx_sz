package com.wx.controller;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


@RestController
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    /**
     * 微信授权
     */
    @PostMapping("/authorizationUser")
    public Map authorizationUser(@RequestBody String code){
        Map map = JSON.parseObject(code, Map.class);
        //授权微信服务器获取数据信息
        String wxUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=wx2afad5ac66e7188d&secret=b3e47f34b4f8e2878d3c04ae92d31edb&js_code="+map.get("code")+"&grant_type=authorization_code";
       // System.out.println(wxUrl);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(wxUrl);
        Map<String,String> retuMap = new HashMap<>();
        try {
            CloseableHttpResponse response1 = httpclient.execute(httpGet);
            HttpEntity entity = response1.getEntity();
            String string = EntityUtils.toString(entity, "UTF-8");
            Map map1 = JSON.parseObject(string, Map.class);
            String openid=(String) map1.get("openid");
            retuMap.put("openid",openid);
            return retuMap;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retuMap;
    }


}
