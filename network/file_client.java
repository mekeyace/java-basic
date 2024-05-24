package net;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client - FTP Server에 File전송
public class file_client {
	public static void main(String[] args) {
		new ftp_client("172.30.1.22",10000);
	}
}
class ftp_client{
	String ip = null;
	int port = 0;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	
	public ftp_client(String serverip, int serverport) {
			this.ip = serverip;
			this.port = serverport;
			this.files();
	}
	private void files() {
			Scanner sc = new Scanner(System.in);
			try {
				this.sk = new Socket(this.ip, this.port);
				System.out.println("업로드할 이미지 경로를 입력하세요 : ");
				String url = sc.nextLine();
				//자신의 PC에 있는 파일을 메모리에 임시저장 시킴
				this.is = new FileInputStream(url);
				BufferedInputStream bs = new BufferedInputStream(this.is);
				byte img[] = new byte[bs.available()];
				bs.read(img);
				
				//서버로 전송
				this.os = this.sk.getOutputStream();
				this.os.write(img);
				this.os.close();
				this.is.close();
				sc.close();
				System.out.println("파일 전송이 완료 되었습니다.");
				
			}catch(Exception e) {
				System.out.println("서버에 접속하지 못하였습니다.");
			}
	}
}

