/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: ConcreteHandler1.java, v 0.1 2014-12-20 ÏÂÎç6:51:04 qinghuajiang Exp $
 */
public class ConcreteHandler1 extends Handler {

    /** 
     * @return
     * @see com.taobao.designmodel.prototype.responsibility.Handler#getHandlerLevel()
     */
    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    /** 
     * @param request
     * @return
     * @see com.taobao.designmodel.prototype.responsibility.Handler#echo(com.taobao.designmodel.prototype.responsibility.Request)
     */
    @Override
    protected Response echo(Request request) {
        return new Response("1 response");
    }

}
