package com.pingping.api; /**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author iqing.wyx
 * @version com.pingping.api.ApiServerApplication.java, v 0.1 2023年10月30日 下午5:50 Exp $
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.pingping.service"})
public class ApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiServerApplication.class, args);
    }
}