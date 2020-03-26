package com.helloweenvsfei.spring.example;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdviceImpl implements MethodBeforeAdvice {
	// MethodBeforeAdvice 實現攔截器介面
	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		System.out.println("執行前檢查... ");//輸出資訊
		System.out.println("Method: " + method.getName());//輸出方法名
		System.out.println("Args: " + Arrays.asList(args));//輸出方法的參數
		System.out.println("Object: " + obj);//輸出物件
	}
}
