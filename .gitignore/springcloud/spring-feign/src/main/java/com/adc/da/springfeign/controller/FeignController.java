package com.adc.da.springfeign.controller;

import com.adc.da.springfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author zb
 * @date 2018-09-21
 */
@RestController
public class FeignController {
    /**
     * 报错因为找不到注册的bean，这个bean是在程序启动的时候注册的
     */
    @Autowired
    FeignService feignService;
    @RequestMapping("/get")
    public String get(@RequestParam String name ){
        return feignService.getPort(name);
    }
}
