/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 处理返回的数据
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Response.java, v 0.1 2014-12-20 下午6:54:14 qinghuajiang Exp $
 */
public class Response {
    private String response;

    /**
     * 
     */
    public Response(String response) {
        this.response = response;
    }

    /** 
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return response;
    }
}
