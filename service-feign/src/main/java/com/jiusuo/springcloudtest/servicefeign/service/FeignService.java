package com.jiusuo.springcloudtest.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("baobao-service")
public interface FeignService {

    @RequestMapping(value = "/test/hello", method = RequestMethod.GET)
    String helloFeign(@RequestParam(value = "name") String name);

}
