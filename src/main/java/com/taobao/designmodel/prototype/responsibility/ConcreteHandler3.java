/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 处理level为3的
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: ConcreteHandler3.java, v 0.1 2014-12-20 下午6:52:14 qinghuajiang Exp $
 */
public class ConcreteHandler3 extends Handler {

    /** 
     * @return
     * @see com.taobao.designmodel.prototype.responsibility.Handler#getHandlerLevel()
     */
    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    /** 
     * @param request
     * @return
     * @see com.taobao.designmodel.prototype.responsibility.Handler#echo(com.taobao.designmodel.prototype.responsibility.Request)
     */
    @Override
    protected Response echo(Request request) {
        return new Response("3 response");
    }

}
