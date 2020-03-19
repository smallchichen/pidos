package com.helloweenvsfei.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	private static final long serialVersionUID = 7298032096933866458L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>請登入檢視 Notice 檔案</TITLE></HEAD>");
		out.println("<style>body, td, div {font-size:12px; }</style>");
		out.println("  <BODY>");

		out.println("<form action='" + request.getRequestURI() + "' method='post'>");
		out.println("帳號：<input type='text' name='username' style='width:200px; '> <br/>");
		out.println("密碼：<input type='password' name='password' style='width:200px; '> <br/><br/>");
		out.println("<input type='submit' value='  登入  '>");
		out.println("</form>");

		if (true) {
			out.println("<br/><br/><br/><br/><br/><br/><br/>使用者名稱、密碼為：<br/>");
			Enumeration params = this.getInitParameterNames();
			while (params.hasMoreElements()) {
				String usernameParam = (String) params.nextElement();
				String passnameParam = this.getInitParameter(usernameParam);
				out.println("[" + usernameParam + ", " + passnameParam + "], ");
			}
		}

		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 傳送的 username 參數
		String username = request.getParameter("username");
		// 傳送的 password 參數
		String password = request.getParameter("password");
		// 取所有的初始化參數名稱
		Enumeration params = this.getInitParameterNames();
		while (params.hasMoreElements()) {
			String usernameParam = (String) params.nextElement();
			// 取參數值
			String passnameParam = this.getInitParameter(usernameParam);
			// 如果 username 比對且 password 比對. username 大小寫不敏感，password大小寫敏感
			if (usernameParam.equalsIgnoreCase(username) && passnameParam.equals(password)) {
				// 顯示檔案。/WEB-INF 下的檔案不能透過瀏覽器存取到，因此是安全的
				request.getRequestDispatcher("/WEB-INF/notice.html").forward(request, response);
				return;
			}
		}
		// username，password 不比對，顯示登入頁面
		this.doGet(request, response);
	}

}
