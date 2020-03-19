package com.helloweenvsfei.spring.example;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class SpringTest {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));

		// 從設定檔案中獲得對像
		IService hello = (IService) factory.getBean("service");
		hello.service("Helloween");

		factory.destroySingletons();
	}

}
