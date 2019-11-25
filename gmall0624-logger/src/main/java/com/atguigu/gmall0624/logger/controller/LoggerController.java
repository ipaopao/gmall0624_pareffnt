package com.atguigu.gmall0624.logger.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoggerController {

    @PostMapping("log")
    public String log (@RequestParam("logString") String logString){
        System.out.println(logString);
        JSONObject jsonObject =  JSON.parseObject(logString);
        jsonObject.put("ts",System.currentTimeMillis());
        String jsonString =jsonObject.toJSONString();
        log.info(jsonString);
        return "success";
    }

}
