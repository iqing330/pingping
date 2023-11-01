/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.trade.controller;

import com.pingping.core.vo.Trade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iqing.wyx
 * @version TradeController.java, v 0.1 2023年10月31日 下午4:11 Exp $
 */
@RestController
public class TradeController {

    @GetMapping(path = "/trade")
    public Trade getUser(@RequestParam(name = "tradeId") String tradeId) {
        return new Trade(tradeId, "交易流水");
    }
}