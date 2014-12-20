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
 * @version $Id: ConcreteStrategy1.java, v 0.1 2014-12-20 下午9:40:13 qinghuajiang Exp $
 */
public class ConcreteStrategy1 implements Strategy {

    /** 
     * 
     * @see com.taobao.designmodel.prototype.strategy.Strategy#doSomething()
     */
    public void doSomething() {
        System.out.println("策略1的实现");
    }

}
