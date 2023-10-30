/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.pingping.dao;

/**
 * @author iqing.wyx
 * @version TestDao.java, v 0.1 2023年10月12日 下午3:55 Exp $
 */
public class TestDao {

    public TestDao(String a, String b) {
        this.a = a;
        this.b = b;
    }

    private String a;

    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}