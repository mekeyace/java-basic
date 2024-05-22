package io;

import java.io.FileReader;
import java.io.LineNumberReader;

//데이터 라인 갯수 확인
public class file7 {
	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		FileReader fr = new FileReader(url);
		/*
		 LineNumberReader : 해당 문서에 라인 갯수를 확인하는 클래스 
		*/
		LineNumberReader nr = new LineNumberReader(fr);
		//System.out.println(nr.readLine());
		//System.out.println(nr.getLineNumber());
		int n = 0;
		while(nr.readLine()!=null) {
			n = nr.getLineNumber();
			System.out.println(n);
		}
		
		nr.close();
		fr.close();		
	}
}
