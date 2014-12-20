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
 * @version $Id: OuterUserBaseInfo.java, v 0.1 2014-12-20 ����9:55:50 qinghuajiang Exp $
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    /** 
     * @return
     * @see com.taobao.designmodel.prototype.adapter.IOuterUserBaseInfo#getUserBaseInfo()
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "���Ա��������11");
        baseInfoMap.put("mobileNum", "�绰��12344");
        return baseInfoMap;
    }
}
