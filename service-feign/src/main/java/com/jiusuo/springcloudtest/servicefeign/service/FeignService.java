package com.jiusuo.springcloudtest.servicefeign.service;

import com.jiusuo.springcloudtest.servicefeign.service.impl.FeignServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "baobao-service", fallback = FeignServiceImpl.class)
@Qualifier("feignService")
public interface FeignService {

    @RequestMapping(value = "/test/hello", method = RequestMethod.GET)
    String helloFeign(@RequestParam(value = "name") String name);

}
