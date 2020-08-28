package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test/getInfo")
    @ResponseBody
    public String getInfo() {
        return "getInfo(): 第一个接口返回";
    }
}
