package com.helloweenvsfei.ch02.firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloSerlet")
public class HelloSerlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");// 設定response，request編碼方式
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");// 設定文件類型
		PrintWriter out = response.getWriter();// 獲得out物件
		// 輸出到用戶端瀏覽器
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("<BODY>");
		String requestURI = request.getRequestURI(); //獲得到URI路徑
		out.println("<form action='" + requestURI + "' methid='post'>");
		out.println("請輸入你的名字：<input type='text' name='name' />");
		out.println("<input type='submit' />");
		out.println("</form>");
		out.println("");
		String name = request.getParameter("name");//獲得瀏覽器傳送的name參數
		if(name != null && name.trim().length() > 0) {
			//如果name不為空且長度大於0
			out.println("你好， <b>" + name + "</b>. 歡迎來到 Java Web 世界.");
		}
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
