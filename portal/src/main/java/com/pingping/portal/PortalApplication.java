/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author iqing.wyx
 * @version PortalApplication.java, v 0.1 2023年10月31日 下午2:37 Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.pingping.service.user", "com.pingping.service.order"})
public class PortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }
}