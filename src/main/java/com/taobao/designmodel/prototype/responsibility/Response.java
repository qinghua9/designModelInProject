/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * �����ص�����
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Response.java, v 0.1 2014-12-20 ����6:54:14 qinghuajiang Exp $
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
