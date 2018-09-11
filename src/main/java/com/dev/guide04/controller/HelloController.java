package com.dev.guide04.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("ddcat")
    public String show(){

        return "静态资源一般放在static等规定的文件夹即可直接访问";
    }

}
