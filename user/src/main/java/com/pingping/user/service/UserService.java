/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.user.service;

import com.pingping.core.vo.User;

/**
 * @author iqing.wyx
 * @version UserService.java, v 0.1 2023年10月31日 下午3:47 Exp $
 */
public interface UserService {

    User getUser(String userId);
}