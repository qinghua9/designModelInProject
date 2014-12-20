/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.adapter;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 обнГ10:10:46 qinghuajiang Exp $
 */
public class Client {

    /**
     * <pre>
     * 
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {
        IOuterUserBaseInfo bi = new OuterUserBaseInfo();
        IOuterUserHomeInfo hi = new OuterUserHomeInfo();
        IOuterUserOfficeInfo oi = new OuterUserOfficeInfo();
        IOuterUserInfo youngGirl = new OuterUserInfo(bi, hi, oi);
        for (int i = 0; i < 5; i++) {
            youngGirl.getHomeTelNumber();
        }
    }

}
