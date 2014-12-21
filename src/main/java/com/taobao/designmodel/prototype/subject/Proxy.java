package com.taobao.designmodel.prototype.subject;

public class Proxy implements Subject {

	private Subject subject = null;

	public Proxy() {
		this.subject = new Proxy();
	}

	public Proxy(Object... objects) {
		this.subject = new Proxy();
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {
		// 代理 执行之前做一些事
	}

	private void after() {
		// 代理完成后做一些事
	}
}
