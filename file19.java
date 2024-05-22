package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Stream + Reader 응용편
/*
 FileInputStream >  BufferedReader
 InputStream >  InputStreamReader  > BufferedReader (O) 
 InputStream > BufferedReader (X)
 InputStream > BufferedInputStream (O) 
 InputStreamReader > BufferedReader (O)
 
 ※ BufferedReader - close() 메모리 종료, BufferedWriter - flush() + close() 
 */
public class file19 {
	
	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		File f = new File(url);
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {

			fos = new FileOutputStream(f); //true를 사용해야함
			osw = new OutputStreamWriter(fos);		//Stream -> Writer	
			bw = new BufferedWriter(osw);		//메모리를 활용
			
			bw.append("이메일정책 추가사항");
			bw.newLine();		//한 줄 내려쓰기
			bw.append("본 이메일 정책이 변경된 사항이 있습니다.");
			bw.flush();   //메모리 영역을 완전 초기화 
			
			//input으로 출력
			InputStream is = new FileInputStream(f);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());	
			
			br.close();
			isr.close();
			is.close();
		}
		catch(Exception e) {
			e.getMessage();
		}
		finally {

			bw.close();
			osw.close();
			fos.close();

		}
	}
}
