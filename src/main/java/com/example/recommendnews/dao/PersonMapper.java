package com.example.recommendnews.dao;

import com.example.recommendnews.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Description
 * @Author 11103882
 * @Date 2019/8/28
 * @Version 1.0
 */

@Mapper
public interface PersonMapper {

    @Select("select * from mytable where my_id = #{id}")
    Person getById(Integer id);
}
