/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iqing.wyx
 * @version HomeController.java, v 0.1 2023年10月31日 上午11:44 Exp $
 */
@RestController
public class HomeController {

    @GetMapping("/go")
    public String go() {
        return "ok";
    }
}