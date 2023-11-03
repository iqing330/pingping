/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.service.trade;

import com.pingping.core.vo.Trade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author iqing.wyx
 * @version TradeService.java, v 0.1 2023年10月31日 下午4:17 Exp $
 */
@FeignClient(name = "trade", url = "http://trade")
public interface TradeService {

    @GetMapping(path = "/trade")
    Trade getTrade(@RequestParam(name = "tradeId") String tradeId);
}