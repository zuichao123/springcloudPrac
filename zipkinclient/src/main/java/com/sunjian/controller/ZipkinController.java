package com.sunjian.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian
 * @date 2020/4/4 12:51
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    private String index(){
        return this.port;
    }
}
