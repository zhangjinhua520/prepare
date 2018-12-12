package com.zjh.prepare.service.impl;

import com.zjh.prepare.mapper.UserMapper;
import com.zjh.prepare.model.Preson;
import com.zjh.prepare.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: zhangjiinh
 * @Date: 2018/12/12 11:24
 * @Version 1.0
 */
@Service
public class UserService implements IUserService {
    @Resource
    private UserMapper userMapper;

    public Preson queryPreson(Integer id){
        return userMapper.queryPreson(id);
    }
}
