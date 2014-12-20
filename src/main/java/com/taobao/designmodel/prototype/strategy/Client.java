/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.strategy;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 下午9:44:00 qinghuajiang Exp $
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
        //声明一个策略
        Strategy str = new ConcreteStrategy1();
        Context con = new Context(str);
        con.doAnything();
    }

}
