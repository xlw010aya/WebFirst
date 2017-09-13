package com.helloweenvsfei.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet {

	private static final long serialVersionUID = 2112378505872783022L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println("��ʹ�� POST ��ʽ�ύ���ݡ�");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		// �� �ı��� text ��ȡ����
		String name = request.getParameter("name");
		// �� ������ password ��ȡ����
		String password = request.getParameter("password");
		// �� ��ѡ�� checkbox ��ȡ�Ա�
		String sex = request.getParameter("sex");

		int age = 0;
		try {
			// ȡ ����. ��Ҫ�� �ַ��� ת��Ϊ int.
			// �����ʽ���Ի��׳� NumberFormattingException
			age = Integer.parseInt(request.getParameter("age"));
		} catch (Exception e) {
		}

		Date birthday = null;
		try {
			// ȡ ����. ��Ҫ�� �ַ��� ת��Ϊ Date.
			// �����ʽ���Ի��׳� ParseException
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			birthday = format.parse(request.getParameter("birthday"));
		} catch (Exception e) {
		}

		// �� ��ѡ�� checkbox ��ȡ���ֵ
		String[] interesting = request.getParameterValues("interesting");
		// �� ������ select ��ȡֵ
		String area = request.getParameter("area");
		// �� �ı��� textarea ��ȡֵ
		String description = request.getParameter("description");

		// ȡ �ύ��ť �ļ�ֵ
		String btn = request.getParameter("btn");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>��л���ύ��Ϣ</TITLE>");
		out.println("<style>");
		out.println("body, div, td, input {font-size:12px; margin:0px; }");
		out.println(".line {margin:2px; }");
		out
				.println(".leftDiv {width:110px; float:left; height:22px; line-height:22px; font-weight:bold; }");
		out.println(".rightDiv {height:22px; line-height:22px; }");
		out.println(".button {");
		out.println("	color:#fff;");
		out.println("	font-weight:bold;");
		out.println("	font-size: 11px; ");
		out.println("	text-align:center;");
		out.println("	padding:.17em 0 .2em .17em;");
		out.println("	border-style:solid;");
		out.println("	border-width:1px;");
		out.println("	border-color:#9cf #159 #159 #9cf;");
		out
				.println("	background:#69c url(/servlet/images/bg-btn-blue.gif) repeat-x;");
		out.println("</style>");
		out.println("</HEAD>");

		out.println("<div align=\"center\"><br/>");
		out.println("<fieldset style='width:90%'><legend>��д�û���Ϣ</legend><br/>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>����������</div>");
		out.println("			<div align='left' class='rightDiv'>" + name + "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>�������룺</div>");
		out.println("			<div align='left' class='rightDiv'>" + password
				+ "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>�����Ա�</div>");
		out.println("			<div align='left' class='rightDiv'>" + sex + "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>�������䣺</div>");
		out.println("			<div align='left' class='rightDiv'>" + age + "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>�������գ�</div>");
		out.println("			<div align='left' class='rightDiv'>");
		out.println(new SimpleDateFormat("yyyy��MM��dd��").format(birthday));
		out.println("			</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>������Ȥ��</div>");
		out.println("			<div align='left' class='rightDiv'>");

		if (interesting != null)
			for (String str : interesting) {
				out.println(str + ", ");
			}

		out.println("			</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>����������</div>");
		out.println("			<div align='left' class='rightDiv'>" + description
				+ "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'>��ť��ֵ��</div>");
		out.println("			<div align='left' class='rightDiv'>" + btn + "</div>");
		out.println("		</div>");

		out.println("		<div class='line'>");
		out.println("			<div align='left' class='leftDiv'></div>");
		out.println("			<div align='left' class='rightDiv'>");
		out
				.println("				<br/><input type='button' name='btn' value='������һҳ' onclick='history.go(-1); ' class='button'><br/>");
		out.println("			</div>");
		out.println("		</div>");

		out.println("<BODY>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}
}
