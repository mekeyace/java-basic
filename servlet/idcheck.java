package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class idcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PrintWriter pw = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setCharacterEncoding("utf-8");
				response.setContentType("text/html");
				String mid = request.getParameter("mid");
				this.pw = response.getWriter();
				if(mid.equals("")) {
						this.pw.write("<script>"
								+ "alert('올바른 접근이 아닙니다.');"
								+ "history.go(-1);"
								+ "</script>");
				}
				else {
					if(mid.equals("admin")) {
						this.pw.write("<script>"
								+ "alert('해당 아이디는 사용불가 입니다.');"
								+ "history.go(-1);"
								+ "</script>");
					}
					else {
						this.pw.write("<script>"
								+ "alert('사용가능한 아이디 입니다.');"
								+ "location.href = 'http://naver.com';"
								+ "</script>");
					}
				}
				this.pw.close();
	}

}
