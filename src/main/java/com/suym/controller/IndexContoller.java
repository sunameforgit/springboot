package com.suym.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@EnableAutoConfiguration
//直接渲染字符串返回
@RestController
public class IndexContoller {
    @RequestMapping("/index")
    public Map<String, String> index(){
        Map map = new HashMap<String, String>();
        map.put("x","x");
        return map;
    }
}
