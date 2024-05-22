package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

//파일 용량 체크로 업로드 방식 (Buffered)
public class file17 {
	public static void main(String[] args) {
		String url = "d:\\product\\img1.png";	//2MB
		String url2 = "d:\\product\\img2.jpeg";	//2MB 이하
		try {
			//BufferedInputStream : byte 내용을 temp 임시 메모리에 저장
			InputStream is = new FileInputStream(url2);
			BufferedInputStream bs = new BufferedInputStream(is);
			//System.out.println(bs.available());
			if(bs.available() > 2097152) {
				System.out.println("이미지는 최대 2MB 이하의 파일만 업로드 가능");
			}
			else {
				byte file[] = new byte[bs.available()];		//buffer로 해당 값을 byte로 변환
				
				//OutputStream : 사용시 파일명 변경 가능
				FileOutputStream fs = new FileOutputStream("d:\\upload\\20240522.jpeg"); 
				bs.read(file);	//픽셀값 전체 사이즈
				fs.write(file);	//byte 모두 저장
				fs.flush();	
				fs.close();
				System.out.println("정상적으로 업로드 되었습니다.");
			}
			
			bs.close();
			is.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
