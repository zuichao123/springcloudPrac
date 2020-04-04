package com.sunjian.feignService;

import com.sunjian.entity.Student;
import com.sunjian.feignService.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author sunjian
 * @date 2020/4/4 0:05
 */
@FeignClient(value = "provider", fallback = FeignError.class) // provider 服务done的时候，会返回FeignError中对应方法的信息
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
