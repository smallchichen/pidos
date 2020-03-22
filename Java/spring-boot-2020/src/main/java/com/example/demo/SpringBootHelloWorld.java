package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/qq") /* 具體指出request的類別 */
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	@RequestMapping("/")
//	public String hello(){
//		return "Hey, Spring Boot 的 Hello World ! ";
//	}

	@GetMapping("/x")
	public String hello() {
		return "Hey, Spring Boot 的 Hello World !";
	}

	@GetMapping("/index")
	/*
	 * @GetMapping 配合@RequestMapping使用 
	 * 當HTTP GET request是 /qq時，
	 * orderForm() 會被觸發。
	 */
	public String helloIndex() {
		return "index";
	}
}
