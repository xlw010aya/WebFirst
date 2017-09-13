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
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>���¼�鿴 Notice �ļ�</TITLE></HEAD>");
		out.println("<style>body, td, div {font-size:12px; }</style>");
		out.println("  <BODY>");
		
		out.println("<form action='" + request.getRequestURI() + "' method='post'>");
		out.println("�ʺţ�<input type='text' name='username' style='width:200px; '> <br/>");
		out.println("���룺<input type='password' name='password' style='width:200px; '> <br/><br/>");
		out.println("<input type='submit' value='  ��¼  '>");
		out.println("</form>");
		
		if(true){
			out.println("<br/><br/><br/><br/><br/><br/><br/>�û���������Ϊ��<br/>");
			Enumeration params = this.getInitParameterNames();
			while(params.hasMoreElements()){
				String usernameParam = (String)params.nextElement();
				String passnameParam = this.getInitParameter(usernameParam);
				out.println("[" + usernameParam + ", " + passnameParam + "], ");
			}
		}
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �ύ�� username ����
		String username = request.getParameter("username");
		// �ύ�� password ����
		String password = request.getParameter("password");
		// ȡ���еĳ�ʼ����������
		Enumeration params = this.getInitParameterNames();
		while(params.hasMoreElements()){
			String usernameParam = (String)params.nextElement();
			// ȡ����ֵ
			String passnameParam = this.getInitParameter(usernameParam);
			// ��� username ƥ���� password ƥ��. username ��Сд�����У�password��Сд����
			if(usernameParam.equalsIgnoreCase(username)
					&& passnameParam.equals(password)){
				// ��ʾ�ļ���/WEB-INF �µ��ļ�����ͨ����������ʵ�������ǰ�ȫ��
				request.getRequestDispatcher("/WEB-INF/notice.html").forward(request, response);
				return;
			}
		}
		// username��password ��ƥ�䣬��ʾ��¼ҳ��
		this.doGet(request, response);		
	}

}
