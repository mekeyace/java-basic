package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class emailok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter pw = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		String msg = "";
		String webmail = request.getParameter("email");
		if(webmail.equals("")) {
			msg = "alert('올바른 접근이 아닙니다.'); history.go(-1);";
		}
		else {
			if(webmail.equals("apink@naver.com")) {
				msg = "alert('이미 인증된 메일 주소 입니다.'); history.go(-1);";
			}
			else {
				msg = "alert('인증번호가 이메일로 발송 되었습니다.'); history.go(-1);";
			}
		}
		this.pw = response.getWriter();
		this.pw.write("<script>"+msg+"</script>");
		this.pw.flush();
		this.pw.close();
	}

}
