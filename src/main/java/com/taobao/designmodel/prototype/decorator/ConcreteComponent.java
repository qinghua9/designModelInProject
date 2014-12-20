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
 * @version $Id: ConcreteComponent.java, v 0.1 2014-12-20 обнГ7:45:43 qinghuajiang Exp $
 */
public class ConcreteComponent extends Component {

    /** 
     * 
     * @see com.taobao.designmodel.prototype.decorator.Component#operate()
     */
    @Override
    public void operate() {
        System.out.println("decoreator");
    }

}
