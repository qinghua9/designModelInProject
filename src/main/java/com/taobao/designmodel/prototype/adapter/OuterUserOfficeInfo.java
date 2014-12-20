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
 * @version $Id: OuterUserOfficeInfo.java, v 0.1 2014-12-20 ����9:59:46 qinghuajiang Exp $
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    /** 
     * @return
     * @see com.taobao.designmodel.prototype.adapter.IOuterUserOfficeInfo#getUserOfficeInfo()
     */
    public Map getUserOfficeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("jobPostion", "ְλ��boss");
        baseInfoMap.put("officeTelNumber", "�칫�ҵ绰��1222");
        return baseInfoMap;
    }

}
