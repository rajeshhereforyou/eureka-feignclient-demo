package com.example.eurekafeignclientdemo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClientRequestController {

    @Autowired
    public SampleFeignClient feignClient;

    @RequestMapping(method = RequestMethod.GET, value = "/test-controller/{userId}")
    public List<String> testFeignClient(@PathVariable String userId) {
        return feignClient.getUser(userId);
    }
}
