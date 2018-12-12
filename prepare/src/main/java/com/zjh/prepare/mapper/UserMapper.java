package com.zjh.prepare.mapper;

import com.zjh.prepare.model.Preson;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhangjiinh
 * @Date: 2018/12/12 11:14
 * @Version 1.0
 */
@Repository
public interface UserMapper {
    @Select("select * from test.preson where id = #{id}")
    Preson queryPreson(Integer id);
}
