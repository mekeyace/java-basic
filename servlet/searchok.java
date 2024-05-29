package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class searchok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			//request.setCharacterEncoding("utf-8");   //전송 데이터가 한글이 깨질경우
			String word = request.getParameter("search");		//get,post 같음
			String key = request.getParameter("key");
			System.out.println(word);
			System.out.println(key);
			
	}

}
