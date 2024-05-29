package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//HttpServlet : Java파일을 http로 통신 할 수 있는 class
public class site extends HttpServlet {
	//고유번호 (코드 저작권)
	private static final long serialVersionUID = 1L;
	
	
	//doGet : 파라미터값 형태, method=get
	//doPost : method=post  데이터를 처리
	//request : Front-end, response : Back-end
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");		//한글 데이터
		
		//PrintWriter : 스크립트를 적용 또는 HTML 태그를 적용을 할 수 있음
		PrintWriter pw = response.getWriter();
		pw.write("<script>"
					+ "alert('해당 웹 페이지를 확인 하였습니다.');"
					+ "console.log('테스트 콘솔로고');"
					+ "</script>");
		pw.close();	
	}
/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
*/
}