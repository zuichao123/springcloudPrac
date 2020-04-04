package com.sunjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author sunjian
 * @date 2020/4/4 11:24
 */
@SpringBootApplication
@EnableConfigServer
public class NativeconfigserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeconfigserverApplication.class, args);
    }
}
