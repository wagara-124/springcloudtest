package com.jiusuo.springcloudtest.servicefeign.service;

import com.jiusuo.springcloudtest.servicefeign.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "baobao-service", fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/test/hello", method = RequestMethod.GET)
    String helloFeign(@RequestParam(value = "name") String name);

}
