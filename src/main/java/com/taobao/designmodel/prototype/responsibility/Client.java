/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * ���Դ�����
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 ����6:54:52 qinghuajiang Exp $
 */
public class Client {

    public static void main(String[] args) {
        //��������������
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        //�����������еĽ׶�˳��1-2-3
        h1.setNext(h2);
        h2.setNext(h3);
        //�ύ���󣬷��ؽ��
        Response response = h1.handleMessage(new Request(new Level(2)));
        System.out.println(response);
    }
}
