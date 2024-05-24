package net;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//socket : 외부에서 접속을 할 수 있도록 오픈하는 하나의 경로
public class net2 {

	public static void main(String[] args) {
		try {
				//ServerSocket : 서버를 오픈하는 라이브러리 (소켓번호를 셋팅)
				ServerSocket ss = new ServerSocket();
				//InetSocketAddress : 도메인 또는 IP 그리고 오픈할 포트번호
				InetSocketAddress ia = new InetSocketAddress("172.30.1.33",7070);
				
				//bind = add, append  ,  정적(자식생성 후 호출), 동적(부모에게 접근형태)
				ss.bind(ia);
				System.out.println("연결중 입니다....");		//소켓 오픈시 해당 라인 정지(대기)
				
				//소켓으로 접속시 아래의 코드가 활성화
				Socket sc = ss.accept();
				
				//getRemoteSocketAddress : 상대방의 IP정보를 확인 및 접속 소켓 확인
				InetSocketAddress ia2 = (InetSocketAddress)sc.getRemoteSocketAddress();
				System.out.println("연결확인");
		}
		catch(Exception e) {
			System.out.println("해당 서버에 문제가 발생 하였습니다.");
		}
	}

}
