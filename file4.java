package io;

import java.io.File;

//파일 생성

public class file4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("D:\\webpage\\agree\\src\\main\\java\\io\\");
		sb.append("member.txt");
		try {
			//File은 : 실제 경로에서 생성, 삭제, 다른 경로 이동, 해당 파일명, 속성변경
			File f = new File(String.valueOf(sb));	//File는 파일 생성파트
			f.createNewFile();	//파일을 생성하는 메소드 
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
