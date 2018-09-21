package com.adc.da.springfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="EUREKA-CLIENT")
public interface FeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String getPort(@RequestParam("name") String name);
}
