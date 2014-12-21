package com.taobao.designmodel.demo.subject;

import java.lang.reflect.Method;

public interface IGamePlayIH {

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable;
}
