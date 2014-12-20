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
 * @version $Id: ConcreteStrategy2.java, v 0.1 2014-12-20 下午9:41:14 qinghuajiang Exp $
 */
public class ConcreteStrategy2 implements Strategy {

    /** 
     * 
     * @see com.taobao.designmodel.prototype.strategy.Strategy#doSomething()
     */
    public void doSomething() {
        System.out.println("策略2的实现");
    }

}
