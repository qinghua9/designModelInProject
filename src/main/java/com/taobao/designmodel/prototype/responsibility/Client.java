/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 测试处理类
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 下午6:54:52 qinghuajiang Exp $
 */
public class Client {

    public static void main(String[] args) {
        //定义三个处理类
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        //设置责任链中的阶段顺序1-2-3
        h1.setNext(h2);
        h2.setNext(h3);
        //提交请求，返回结果
        Response response = h1.handleMessage(new Request(new Level(2)));
        System.out.println(response);
    }
}
