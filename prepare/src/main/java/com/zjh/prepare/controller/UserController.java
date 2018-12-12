package com.zjh.prepare.controller;

import com.zjh.prepare.model.Preson;
import com.zjh.prepare.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zhangjiinh
 * @Date: 2018/12/12 14:12
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    IUserService userService;
    @RequestMapping("queryUser/{id}")
    @ResponseBody
    public Preson selectUser (@PathVariable int id){
        return userService.queryPreson(id);
    }
}
