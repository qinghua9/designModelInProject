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
		// ���� ִ��֮ǰ��һЩ��
	}

	private void after() {
		// ������ɺ���һЩ��
	}
}
