package com.nokekang.democors.model;

import lombok.Data;

/**
 * @Description TODO
 * @Author sunjiankang
 * @Date 2019/6/24 14:11
 */
@Data
public class User {
    private String userName;
    private Integer age;

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
