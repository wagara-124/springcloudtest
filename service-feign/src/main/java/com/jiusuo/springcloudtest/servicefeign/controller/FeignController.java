package com.jiusuo.springcloudtest.servicefeign.controller;

import com.jiusuo.springcloudtest.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "helloFeign")
    public String helloFeign(@RequestParam(value = "name", defaultValue = "Feign") String name) {
        return feignService.helloFeign(name);
    }


}
