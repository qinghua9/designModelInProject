/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.decorator;

/**
 * <pre>
 * 抽象装饰类
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Decorator.java, v 0.1 2014-12-20 下午7:47:06 qinghuajiang Exp $
 */
public class Decorator extends Component {

    private Component component = null;

    /**
     * 
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /** 
     * 
     * @see com.taobao.designmodel.prototype.decorator.Component#operate()
     */
    @Override
    public void operate() {
        this.component.operate();
    }

}
