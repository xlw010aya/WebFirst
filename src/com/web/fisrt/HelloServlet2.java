package com.web.fisrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet2 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public HelloServlet2() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		this.log("ִ��  doGet ����������");
		this.execute(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		this.log("ִ��  doPost ����������");
		this.execute(request,response);
	}
	
	@Override
	public long getLastModified(HttpServletRequest request){
//		this.log("ִ�� getLastMOdified ����");
		return -1;
	}
	
	public void execute(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String requestURI = request.getRequestURI();
		String method = request.getMethod();
		String param = request.getParameter("param");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		
		out.println("  ��"+ method + "��ʽ���ʸ�ҳ�档�õ���param����Ϊ:" + param + "<br/>");
		out.println(" <form action='" + requestURI +"' method='get'><input type='text' name='param' value='param string'>"
				+ "<input type='submit' value='�� GET ��ʽ��ѯҳ��'" + requestURI + "></form>");
		out.println(" <form action='" + requestURI +"' method='post'><input type='text' name='param' value='param string'>"
				+ "<input type='submit' value='�� POST ��ʽ��ѯҳ��'" + requestURI + "></form>");
		
		out.println(" <script>document.write('��ҳ��������ʱ��' + document.lastModified);</script>");
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
