/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.service.user;

import com.pingping.core.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author iqing.wyx
 * @version UserService.java, v 0.1 2023年10月31日 下午4:17 Exp $
 */
@FeignClient(name = "user", url = "http://user")
public interface UserService {

    @GetMapping(path = "/user")
    User getUser(@RequestParam(name = "userId") String userId);
}