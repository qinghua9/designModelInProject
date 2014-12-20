/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.decorator;

/**
 * <pre>
 * 有点抽像的是Decorator类以及两个字类
 * 适用于给一个类扩展属性，但不给这个类增加属性的场合
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 下午7:54:28 qinghuajiang Exp $
 */
public class Client {
    public static void main(String[] args) {
        Component com = new ConcreteComponent();
        //第一次装饰
        com = new ConcreteDecorator1(com);
        //第二次装饰
        com = new ConcreteDecorator2(com);
        //装饰后运行
        com.operate();
    }
}
