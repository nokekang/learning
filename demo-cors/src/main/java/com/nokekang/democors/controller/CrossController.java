package com.nokekang.democors.controller;

import com.nokekang.democors.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Description TODO
 * @Author sunjiankang
 * @Date 2019/6/24 14:09
 */
@RestController
@RequestMapping("/user")
public class CrossController {

    private static final Logger logger = LoggerFactory.getLogger(CrossController.class);

    @RequestMapping("/get-all-users")
    public User getUsers(HttpServletResponse response){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("接口访问成功");
        return new User("zhangsan", 18);
    }
}
