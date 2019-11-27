package com.jiusuo.springcloudtest.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/test")
public class RibbonController {

    private final RestTemplate restTemplate;

    public RibbonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "helloRibbon")
    public String helloRibbon(@RequestParam(value = "name", defaultValue = "Ribbon") String name) {
        return restTemplate.getForObject("http://BAOBAO-SERVICE/test/hello?name=" + name, String.class);
    }

}
