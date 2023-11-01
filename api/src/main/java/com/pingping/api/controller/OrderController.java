/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.api.controller;

import com.pingping.core.vo.Order;
import com.pingping.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iqing.wyx
 * @version UserController.java, v 0.1 2023年10月31日 上午11:45 Exp $
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping(path = "/order")
    public Order getOrder(@RequestParam(name = "orderId") String orderId) {
        return orderService.getOrder(orderId);
    }

}