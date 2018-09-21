package com.adc.da.serviceribbon.controller;

import com.adc.da.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2018-09-21
 */
@RestController
public class helloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/getClient")
    public String getClient(String name){
        return helloService.getPort(name);
    }
}
