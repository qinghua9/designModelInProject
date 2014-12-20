/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.responsibility;

/**
 * <pre>
 * 定义一个处理等级
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Level.java, v 0.1 2014-12-20 下午6:52:52 qinghuajiang Exp $
 */
public class Level {
    //默认为0
    private int level = 0;

    /**
     * 
     */
    public Level() {
    }

    /**
     * @param level
     */
    public Level(int level) {
        super();
        this.level = level;
    }

    /**
     * Getter method for property <tt>level</tt>.
     * 
     * @return property value of level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter method for property <tt>level</tt>.
     * 
     * @param level value to be assigned to property level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /** 
     * @param obj
     * @return
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        return this.level == ((Level) obj).getLevel();
    }
}
