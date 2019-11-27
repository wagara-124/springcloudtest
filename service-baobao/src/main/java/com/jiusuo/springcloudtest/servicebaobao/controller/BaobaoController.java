package com.jiusuo.springcloudtest.servicebaobao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class BaobaoController {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Yang Baobao") String name) {
        return "Hello " + name + ", the application port is " + port + "......";
    }

}
