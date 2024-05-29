package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class htmlcodeok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String corp = request.getParameter("corp");			//option value로 전송
			String today = request.getParameter("today");		//datetime-local
			String color = request.getParameter("color");		//#ffff01
			
			//단어변경
			String datetime = today.replace("T", " ") + ":00";
			
			System.out.println(corp);
			System.out.println(datetime);   //2024-05-29 16:25:00
			System.out.println(color);
	}

}
