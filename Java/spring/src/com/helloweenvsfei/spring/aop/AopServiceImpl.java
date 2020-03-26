package com.helloweenvsfei.spring.aop;

import javax.security.auth.login.AccountException;

public class AopServiceImpl implements IAopService {

	private String name;

	public void withAop() throws Exception {

		System.out.println("有AOP的函數執行。name: " + name);

		if (name.trim().length() == 0)
			throw new AccountException("name屬性不能為空");
	}

	public void withoutAop() throws Exception {
		System.out.println("沒有AOP的函數執行。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
