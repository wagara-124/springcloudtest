package com.jiusuo.springcloudtest.servicefeign.controller;

import com.jiusuo.springcloudtest.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class FeignController {

    private final FeignService feignService;

    public FeignController(@Qualifier("feignService") FeignService feignService) {
        this.feignService = feignService;
    }

    @RequestMapping(value = "helloFeign")
    public String helloFeign(@RequestParam(value = "name", defaultValue = "Feign") String name) {
        return feignService.helloFeign(name);
    }


}
