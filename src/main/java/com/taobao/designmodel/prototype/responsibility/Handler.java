/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 抽象处理类
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Handler.java, v 0.1 2014-12-20 下午6:43:10 qinghuajiang Exp $
 */
public abstract class Handler {
    /** 下一位处理者 **/
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        //判断是否是自己处理的级别
        if (this.getHandlerLevel().getLevel() == (request.getRequestLevel().getLevel())) {
            response = this.echo(request);
        } else {//不属于自己的处理级别
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者，业务自行处理
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
