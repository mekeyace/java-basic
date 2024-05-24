package net;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

//네트워크 URL 정보 현황
public class net4 {
	public static void main(String[] args) {
		String url = "https://sonyunara.com/member/join_step1.php";
		
		try {
		URL u = new URL(url);
		URLConnection con = u.openConnection();		//해당 경로 연결
		System.out.println(u.getProtocol());	//http, https, ftp
		System.out.println(u.getPort());		//도메인명 이후 포트번호를 사용할 경우
		System.out.println(u.getHost()); //도메인명
		System.out.println(u.getFile());	//실행파일 (경로 + 파라미터값)
		System.out.println(u.getPath());		//현재 경로 파일
		System.out.println(u.getQuery());	//파라미터값만 사용
		
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fs = new FileOutputStream("d:\\join.html");
		PrintWriter pw = new PrintWriter(fs);
		
		String source = "";
		while((source = br.readLine())!=null) {
			pw.println(source);
			pw.flush();
		}
		
		pw.close();
		fs.close();
		br.close();
		isr.close();
		is.close();
		
		}catch(Exception e) {
			
		}
	}
}
