/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * ��������
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Handler.java, v 0.1 2014-12-20 ����6:43:10 qinghuajiang Exp $
 */
public abstract class Handler {
    /** ��һλ������ **/
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        //�ж��Ƿ����Լ�����ļ���
        if (this.getHandlerLevel().getLevel() == (request.getRequestLevel().getLevel())) {
            response = this.echo(request);
        } else {//�������Լ��Ĵ�����
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //û���ʵ��Ĵ����ߣ�ҵ�����д���
                //TODO
                System.out.println("no Response");
            }
        }
        return response;
    }

    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response echo(Request request);
}
