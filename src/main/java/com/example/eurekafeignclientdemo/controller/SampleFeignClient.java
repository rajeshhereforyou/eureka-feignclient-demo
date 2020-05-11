package com.example.eurekafeignclientdemo.controller;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EurekaFeignClientDemoApplication")
public interface SampleFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    List<String> getUser(@PathVariable String userId);
}
