/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.decorator;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: ConcreteDecorator2.java, v 0.1 2014-12-20 ÏÂÎç7:52:36 qinghuajiang Exp $
 */
public class ConcreteDecorator2 extends Decorator {

    /**
     * @param component
     */
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2ÐÞÊÎ");
    }

    public void operate() {
        this.method2();
        super.operate();
    };
}
