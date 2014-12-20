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
 * @version $Id: Request.java, v 0.1 2014-12-20 обнГ6:53:30 qinghuajiang Exp $
 */
public class Request {

    private Level level = null;

    /**
     * 
     */
    public Request(Level level) {
        this.level = level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getRequestLevel() {
        return level;
    }
}
