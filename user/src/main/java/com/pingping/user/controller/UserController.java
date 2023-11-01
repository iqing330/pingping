/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.user.controller;

import com.pingping.core.vo.User;
import com.pingping.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author iqing.wyx
 * @version UserController.java, v 0.1 2023年10月31日 上午11:45 Exp $
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/user")
    public User getUser(@RequestParam(name = "userId") String userId) {
        return userService.getUser(userId);
    }

}