/*
 * TaoBao.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.taobao.designmodel.prototype.adapter;

import java.util.Map;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author qinghuajiang
 * @version $Id: OuterUserInfo.java, v 0.1 2014-12-20 ����10:04:01 qinghuajiang Exp $
 */
public class OuterUserInfo implements IOuterUserInfo {
    private IOuterUserBaseInfo   baseInfo   = null;

    private IOuterUserHomeInfo   homeInfo   = null;

    private IOuterUserOfficeInfo officeInfo = null;
    //����
    private Map                  baseMap    = null;
    private Map                  homeMap    = null;
    private Map                  officeMap  = null;

    //�������ݶ���
    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo,
                         IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    //��ü�ͥ��ַ
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    //��ü�ͥ�绰
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
