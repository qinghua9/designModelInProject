/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.flyweight;

/**
 * <pre>
 * 享元抽象类
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: Flyweight.java, v 0.1 2014-12-21 上午10:45:55 qinghuajiang Exp $
 */
public abstract class Flyweight {
    /** 内部状态 **/
    private String         intrinsic;
    //外部状态
    protected final String Extrinsic;

    /**
     * 
     */
    public Flyweight(String Extrinsic) {
        this.Extrinsic = Extrinsic;
    }

    public abstract void operate();

    /**
     * Getter method for property <tt>intrinsic</tt>.
     * 
     * @return property value of intrinsic
     */
    public String getIntrinsic() {
        return intrinsic;
    }

    /**
     * Setter method for property <tt>intrinsic</tt>.
     * 
     * @param intrinsic value to be assigned to property intrinsic
     */
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
