package com.adc.da.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2018-09-21
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String getPort(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }
}
