package com.example.eurekafeignclientdemo.controller;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleFeignClientController implements SampleFeignClient {

    @Override
    public List<String> getUser(String userId) {
        return Collections.singletonList("User from Feign Client with id " + userId);
    }
}
