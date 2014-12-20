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
 * @version $Id: ConcreteDecorator1.java, v 0.1 2014-12-20 œ¬ŒÁ7:49:38 qinghuajiang Exp $
 */
public class ConcreteDecorator1 extends Decorator {

    /**
     * @param component
     */
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("–ﬁ Œ¿‡1");
    }

    /** 
     * 
     * @see com.taobao.designmodel.prototype.decorator.Decorator#operate()
     */
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
