package com.helloweenvsfei.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 以 GET 方式存取頁面時執行該函數。 執行 doGet 前會先執行 getLastModified，如果瀏覽器發現 getLastModified
	 * 傳回的數值 與上次存取時傳回的數值相同，則認為該文件沒有更新，瀏覽器採用快取記憶體而不執行 doGet。 如果 getLastModified 傳回
	 * -1，則認為是時刻更新的，總是執行該函數。
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 呼叫 HttpServlet 附帶的日誌函數輸出資訊到控制台
		this.log("執行 doGet 方法... ");

		// 處理 doGet
		this.execute(request, response);
	}

	/**
	 * 以 POST 方式存取頁面時執行該函數。
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.log("執行 doPost 方法... ");

		// 處理 doPost
		this.execute(request, response);
	}

	/**
	 * 傳回該 Servlet 產生的文件的更新時間。對 Get 方式存取有效。 傳回的時間為相對於 1970年1月1日08:00:00 的毫秒數。 如果為 -1
	 * 則認為是實時更新。預設為 -1。
	 */
	@Override
	public long getLastModified(HttpServletRequest request) {

		this.log("執行 getLastModified 方法... ");

		return 0;
	}

	private void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		// 存取該 Servlet 的 URI
		String requestURI = request.getRequestURI();
		// 存取該 Servlet 的方式，是 GET 還是 POST
		String method = request.getMethod();
		// 客戶端傳送的參數 param 值
		String param = request.getParameter("param");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.println("	以 " + method + " 方式存取該頁面。取到的 param 參數為：" + param + "<br/>");

		out.println("	<form action='" + requestURI
				+ "' method='get'><input type='text' name='param' value=''><input type='submit' value='以 GET 方式存取 RequestServlet'></form>");
		out.println("	<form action='" + requestURI
				+ "' method='post'><input type='text' name='param' value=''><input type='submit' value='以 POST 方式存取 RequestServlet'></form>");

		// 由客戶端瀏覽器讀取該文件的更新時間
		out.println("	<script>document.write('本頁面最後更新時間：' + document.lastModified + '<br />'); </script>");
		out.println("	<script>document.write('本頁面URL：' + location + '<br/>' ); </script>");
		out.println("	<script>document.write('返回當前頁面的href（URL）：' + window.location.href + '<br/>' ); </script>");
		out.println("	<script>document.write('屬性返回（當前頁面的）Internet主機的名稱：' + window.location.hostname + '<br/>' ); </script>");
		out.println("	<script>document.write('屬性返回當前頁面的路徑名：' + window.location.pathname + '<br/>' ); </script>");
		out.println("	<script>document.write('屬性返回頁面的Web協議：' + window.location.protocol + '<br/>' ); </script>");
		out.println("	<script>document.write('屬性返回（當前頁面的）Internet主機端口號：' + window.location.port + '<br/>' ); </script>");
		
		out.println("	<input type=\"button\" value=\"Load new document\" onclick=\"newDoc()\"> ");	
		out.println("	<script>function newDoc() { window.location.assign(\"https://www.w3schools.com\") }</script>");

		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();

	}

}
