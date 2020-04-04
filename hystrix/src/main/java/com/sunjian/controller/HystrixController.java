package com.sunjian.controller;

import com.sunjian.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian
 * @date 2020/4/4 10:54
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
