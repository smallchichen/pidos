package com.helloweenvsfei.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helloweenvsfei.util.IpUtil;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String getAccept(String accept){
		StringBuffer buffer = new StringBuffer();
		if(accept.contains("image/gif"))	buffer.append("GIF 檔案, ");
		if(accept.contains("image/x-xbitmap"))	buffer.append("BMP 檔案, ");
		if(accept.contains("image/jpeg"))	buffer.append("JPG 檔案, ");
		if(accept.contains("application/vnd.ms-excel"))	buffer.append("Excel 檔案, ");
		if(accept.contains("application/vnd.ms-powerpoint"))	buffer.append("PPT 檔案, ");
		if(accept.contains("application/msword"))	buffer.append("Word 檔案, ");
		return buffer.toString().replaceAll(", $", "");
	}
	/**
	 * @param locale
	 * @return 語言環境名稱
	 */
	private String getLocale(Locale locale) {
		if(Locale.SIMPLIFIED_CHINESE.equals(locale))	return "簡體中文";
		if(Locale.TRADITIONAL_CHINESE.equals(locale))	return "繁體中文";
		if(Locale.ENGLISH.equals(locale))				return "英文";
		if(Locale.JAPANESE.equals(locale))				return "日文";
		return "未知語言環境";
	}
	/**
	 * @param ip IP地址
	 * @return IP地址對應的實體位置
	 */
	private String getAddress(String ip){
		return IpUtil.getIpAddress(ip);
	}
	
	/**
	 * @param userAgent
	 * @return 客戶端瀏覽器資訊
	 */
	private String getNavigator(String userAgent) {
		if(userAgent.indexOf("TencentTraveler") > 0)	return "騰訊瀏覽器";
		if(userAgent.indexOf("Maxthon") > 0)	return "Maxthon瀏覽器";
		if(userAgent.indexOf("MyIE2") > 0)	return "MyIE2瀏覽器";
		if(userAgent.indexOf("Firefox") > 0)	return "Firefox瀏覽器";
		if(userAgent.indexOf("MSIE") > 0)	return "IE 瀏覽器";
		if(userAgent.indexOf("Chrome") > 0)	return "Chrome 瀏覽器";
		return "未知瀏覽器";
	}

	/**
	 * @param userAgent
	 * @return 客戶端操作系統
	 */
	private String getOS(String userAgent) {
		if(userAgent.indexOf("Windows NT 5.1") > 0)	return "Windows XP";
		if(userAgent.indexOf("Windows 98") > 0)	return "Windows 98";
		if(userAgent.indexOf("Windows NT 5.0") > 0)	return "Windows 2000";
		if(userAgent.indexOf("Windows NT 10.0") > 0)	return "Windows 10";
		if(userAgent.indexOf("Linux") > 0)	return "Linux";
		if(userAgent.indexOf("Unix") > 0)	return "Unix";
		return "未知";
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		response.setContentType("text/html");
		
		String authType = request.getAuthType();
		String localAddr = request.getLocalAddr();
		Locale locale = request.getLocale();
		String localName = request.getLocalName();
		String contextPath = request.getContextPath();
		int localPort = request.getLocalPort();
		String method = request.getMethod();
		String pathInfo = request.getPathInfo();
		String pathTranslated = request.getPathTranslated();
		String protocol = request.getProtocol();
		String queryString = request.getQueryString();
		String remoteAddr = request.getRemoteAddr();
		int port = request.getRemotePort();
		String remoteUser = request.getRemoteUser();
		String requestedSessionId = request.getRequestedSessionId();
		String requestURI = request.getRequestURI();
		StringBuffer requestURL = request.getRequestURL();
		String scheme = request.getScheme();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		String servletPath = request.getServletPath();
		Principal userPrincipal = request.getUserPrincipal();
		
		String accept = request.getHeader("accept");
		String referer = request.getHeader("referer");
		String userAgent = request.getHeader("user-agent");
		System.out.println(userAgent);
		
		String serverInfo = this.getServletContext().getServerInfo();
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		
		// 這裡<title></title>之間的資訊在瀏覽器中顯示為標題
		out.println("  <HEAD><TITLE>Request Servlet</TITLE></HEAD>");
		out.println("  <style>body, font, td, div {font-size:12px; line-height:18px; }</style>");
		out.println("  <BODY>");
		
		out.println("<b>您的IP為</b> " + remoteAddr + "<b>，位於</b> " + getAddress(remoteAddr) + "<b>；您使用</b> " + getOS(userAgent) + " <b>操作系統</b>，" + getNavigator(userAgent) + " <b>。您使用</b> " + getLocale(locale) + "。<br/>");
		out.println("<b>服務器IP為</b> " + localAddr + "<b>，位於</b> " + getAddress(localAddr) + "<b>；服務器使用</b> " + serverPort + " <b>通訊埠，您的瀏覽器使用了</b> " + port + " <b>通訊埠存取本網頁。</b><br/>");
		out.println("<b>服務器軟件為</b>：" + serverInfo + "。<b>服務器名稱為</b> " + localName + "。<br/>");
		out.println("<b>您的瀏覽器接受</b> " + getAccept(accept) + "。<br/>");
		out.println("<b>您從</b> " + referer + " <b>存取到該頁面。</b><br/>");
		out.println("<b>使用的協定為</b> " + protocol + "。<b>URL協定頭</b> " + scheme + "，<b>服務器名稱</b> " + serverName + "，<b>您存取的URI為</b> " + requestURI + "。<br/>" );
		out.println("<b>該 Servlet 路徑為</b> " + servletPath + "，<b>該 Servlet 類名為</b> " + this.getClass().getName() + "。<br/>");
		out.println("<b>本應用程式在硬碟的根目錄為</b> " + this.getServletContext().getRealPath("") + "，<b>網絡相對路徑為</b> " + contextPath + "。 <br/>");
		
		out.println("<br/>");
				
		out.println("<br/><br/><a href=" + requestURI + "> 點擊更新本頁面 </a>");
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
