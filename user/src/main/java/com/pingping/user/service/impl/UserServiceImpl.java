/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.user.service.impl;

import com.pingping.core.vo.User;
import com.pingping.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author iqing.wyx
 * @version UserServiceImpl.java, v 0.1 2023年10月31日 下午3:47 Exp $
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String userId) {
        if(userId.length() > 5) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }
        return new User(userId, "user from db");
    }
}