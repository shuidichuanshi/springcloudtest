package com.adc.da.eurkaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2018-09-21
 */
@RestController()
public class helleController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
