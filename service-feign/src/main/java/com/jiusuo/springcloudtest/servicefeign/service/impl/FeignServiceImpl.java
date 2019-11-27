package com.jiusuo.springcloudtest.servicefeign.service.impl;

import com.jiusuo.springcloudtest.servicefeign.service.FeignService;
import org.springframework.stereotype.Component;

@Component("feignServiceImpl")
public class FeignServiceImpl implements FeignService {

    @Override
    public String helloFeign(String name) {
        return "Hello " + name + ", I'm so sorry the application DOWN!!!";
    }
}
