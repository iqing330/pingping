/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.api.controller;

import com.pingping.core.vo.Trade;
import com.pingping.service.trade.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iqing.wyx
 * @version UserController.java, v 0.1 2023年10月31日 上午11:45 Exp $
 */
@RestController
public class TradeController {

    @Autowired
    TradeService tradeService;

    @GetMapping(path = "/trade")
    public Trade getTrade(@RequestParam(name = "tradeId") String tradeId) {
        return tradeService.getTrade(tradeId);
    }

}