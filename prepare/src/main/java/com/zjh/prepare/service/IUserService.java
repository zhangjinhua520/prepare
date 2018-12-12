package com.zjh.prepare.service;

import com.zjh.prepare.model.Preson;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangjiinh
 * @Date: 2018/12/12 11:22
 * @Version 1.0
 */
@Service
public interface IUserService {
    Preson queryPreson(Integer id) ;
}
