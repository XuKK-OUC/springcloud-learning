package com.atnewstar.eurekaconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Xukaikai
 * @date 2019/9/16 10:46
 */
@FeignClient("eureka-client")
public interface DCService {

    @GetMapping("/dc")
    String consumer();
}
