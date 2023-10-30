/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author iqing.wyx
 * @version EurekaApplication.java, v 0.1 2023年10月30日 下午5:12 Exp $
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

        public static void main(String[] args) {
            SpringApplication.run(EurekaApplication.class, args);
        }
}