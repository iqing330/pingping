/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.service.order;

import com.pingping.core.vo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author iqing.wyx
 * @version OrderService.java, v 0.1 2023年10月31日 下午4:15 Exp $
 */
@FeignClient(name = "order", url = "http://order")
public interface OrderService {

    @GetMapping(path = "/order")
    Order getOrder(@RequestParam(name = "orderId") String orderId);
}