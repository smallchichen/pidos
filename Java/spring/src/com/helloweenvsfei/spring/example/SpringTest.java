package com.helloweenvsfei.spring.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class SpringTest {

	public static void main(String[] args) throws FileNotFoundException {
		/*** ClassPath[參數設定檔] ***/
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		// 從設定檔案中獲得對像
		IService hello = (IService) factory.getBean("service");
		hello.service("Helloween");
		factory.destroySingletons();

//		/*** 系統任意位置 ***/
//		Resource is = new FileSystemResource(
//				"C:\\Users\\PiGod\\Desktop\\Git_test\\pidos\\Java\\spring\\src\\applicationContext.xml");
//		XmlBeanFactory factory2 = new XmlBeanFactory(is);
//		IService hello2 = (IService) factory2.getBean("service");
//		hello2.service("Helloween");
//		factory2.destroySingletons();
//
//		/*** ClassPath[參數設定檔*N個] ***/
//		ClassPathXmlApplicationContext factory3 = new ClassPathXmlApplicationContext(
//				new String[] { "applicationContext.xml" });
//		// 從設定檔案中獲得對像
//		IService hello3 = (IService) factory3.getBean("service");
//		hello3.service("Helloween");
//		factory3.destroy();

	}

}
