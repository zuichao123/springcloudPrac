package com.sunjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author sunjian
 * @date 2020/4/4 13:14
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinserverApplication.class, args);
    }
}
