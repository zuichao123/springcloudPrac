package com.sunjian.feignService.impl;

import com.sunjian.entity.Student;
import com.sunjian.feignService.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author sunjian
 * @date 2020/4/4 8:59
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器正在维护中...";
    }
}
