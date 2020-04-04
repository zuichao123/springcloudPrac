package com.sunjian.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sunjian
 * @date 2020/4/4 10:52
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/index")
    public String index();
}
