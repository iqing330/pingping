/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.order.controller;

import com.pingping.core.vo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iqing.wyx
 * @version OrderController.java, v 0.1 2023年10月31日 下午4:13 Exp $
 */
@RestController
public class OrderController {

    @GetMapping(path = "/order")
    public Order getUser(@RequestParam(name = "orderId") String orderId) {
        return new Order(orderId, "订单流水");
    }

}