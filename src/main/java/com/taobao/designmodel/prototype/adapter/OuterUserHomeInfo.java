/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: OuterUserHomeInfo.java, v 0.1 2014-12-20 ����9:58:19 qinghuajiang Exp $
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    /** 
     * @return
     * @see com.taobao.designmodel.prototype.adapter.IOuterUserHomeInfo#getUserHomeInfo()
     */
    public Map getUserHomeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("homeTelNumber", "��ͥ�绰��12333");
        baseInfoMap.put("homeAddress", "��ͥ��ַ��123233");
        return baseInfoMap;
    }

    /**
     * <pre>
     * 
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {

    }

}
