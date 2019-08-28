package com.example.recommendnews.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description
 * @Author 11103882
 * @Date 2019/8/28
 * @Version 1.0
 */
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private BigDecimal year;
    private Date date;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getYear() {
        return year;
    }

    public void setYear(BigDecimal year) {
        this.year = year;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
