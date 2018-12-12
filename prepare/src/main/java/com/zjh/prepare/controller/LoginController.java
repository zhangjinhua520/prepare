package com.zjh.prepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Author: zhangjiinh
 * @Date: 2018/12/12 14:58
 * @Version 1.0
 */
@Controller
public class LoginController {
    @RequestMapping("/index")
    public String Login(HashMap<String, Object> map) {
        map.put("hello", "欢迎进入HTML页面");
        return "/index";
    }

}
