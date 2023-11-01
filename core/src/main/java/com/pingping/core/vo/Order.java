/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author iqing.wyx
 * @version Order.java, v 0.1 2023年10月31日 下午3:44 Exp $
 */
@Data
@AllArgsConstructor
public class Order {

    private String orderId;

    private String name;
}