package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server Open (Soket통신 환경) - TCP
public class net5 {
	public static void main(String[] args) {
		System.out.println("Server Connect!!");
		int port = 9000;	//서버 port 적용
		try {
			Scanner sc = new Scanner(System.in);
			//해당 포트을 open
			ServerSocket ss = new ServerSocket(port);
			while(true) {		//서버에서 접속을 유지하기 위한 반복문
				Socket sk = ss.accept();
				System.out.println("호스트 통신 연결 성공!!");
				
				/* InputStream : 클라이언트에서 적용된 메세지를 받는 역활 */
				InputStream is = sk.getInputStream();
				byte msg[] = new byte[2048];	//최대 받을 수 있는 메세지양 설정
				is.read(msg);	//메세지 내용 byte단위로 읽어들임
				String result = new String(msg);	//byte를 문자로 변환
				System.out.println(result);		//출력
				
				
				//서버에서 메세지를 클라이언트로 전송
				String cms = sc.nextLine();
				OutputStream os = sk.getOutputStream();
				byte call[] = cms.getBytes();
				os.write(call);
				os.flush();
				
				os.close();
				is.close();
			}
			
		}catch(Exception e) {
			System.out.println("현재 서버 포트 충돌로 인하여 서버를 가동하지 못합니다.");
		}
	}
}
