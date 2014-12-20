/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.decorator;

/**
 * <pre>
 * �е�������Decorator���Լ���������
 * �����ڸ�һ������չ���ԣ�������������������Եĳ���
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Client.java, v 0.1 2014-12-20 ����7:54:28 qinghuajiang Exp $
 */
public class Client {
    public static void main(String[] args) {
        Component com = new ConcreteComponent();
        //��һ��װ��
        com = new ConcreteDecorator1(com);
        //�ڶ���װ��
        com = new ConcreteDecorator2(com);
        //װ�κ�����
        com.operate();
    }
}
