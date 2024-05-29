package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class userinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 service 메소드는  : doGet, doPost 모두 통신을 받을 수 있는 전용 메소드 입니다.
	 Front에서 form과 action에 모두 값을 적용하여 보낼 경우 get, post 모두 필요하므로
	 service 메소드를 활용하며, 단 한글이 깨질 수 있습니다. encoding을 활용하여 언어셋을
	 변환하여 사용합니다. 
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			
			int part = Integer.parseInt(request.getParameter("part"));
			if(part == 1) {		//아이디 찾기
				String id = request.getParameter("username");
				System.out.println(id);
			}
			else {		//패스워드 찾기
				String id = request.getParameter("userid");
				String email = request.getParameter("useremail");
				System.out.println(id);
				System.out.println(email);
			}
	}

}
