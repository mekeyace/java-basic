package io;

import java.io.FileInputStream;

//Stream 활용법 (FileInputStream)
//txt, jpg, png.... => byte
//FileInputStream : 파일을 로드한 후 해당 내용을 byte로 변환하여 결과를 출력
public class file12 {
	public static void main(String[] args) {
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
			FileInputStream fs = new FileInputStream(url);
			//System.out.println(fs.available());		//available() : 파일 용량을 말합니다.
			byte temp[] = new byte[fs.available()];	//[1024*2] => 2Kbyte
			fs.read(temp);		//byte 전체를 읽어들임
			String munja = new String(temp);		//문자열로 반영
			System.out.println(munja);		//출력
			fs.close();
		}catch (Exception e) {
			e.getMessage();
		}
	}
}
