/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.flyweight;

import java.util.HashMap;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: FlyweightFactory.java, v 0.1 2014-12-21 上午10:52:07 qinghuajiang Exp $
 */
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    public static Flyweight getFlyweight(String Extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            flyweight = new ConcreteFlyweight1(Extrinsic);
            //放到池中
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }
}
