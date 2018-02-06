package com.wxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  提供服务控制器
 * @auther wxh
 * @date 2018/1/26 11:00
 */
@RestController
public class HelloController {

    /**
     *  提供一个服务，传递参数
     * @param name
     * @return String
     */
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello " + name + ", this is a first message!";
    }
}
