package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//다른 속성을 가진 ASCII 파일 읽기 및 쓰기
public class file2 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\webpage\\agree\\src\\main\\java\\io\\member.dat");
		//해당 라인전체를 읽어 들어들이는 방식
		Scanner file = new Scanner(fr);
		System.out.println(file.nextLine());
		
		file.close();
		fr.close();
		/*
		FileWriter fw = new FileWriter("D:\\webpage\\agree\\\\src\\\\main\\\\java\\io\\member.dat");
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 내용 입력 : ");
		fw.write(sc.nextLine());		//write : 해당 내용을 저장 시키는 메소드
		sc.close();
		fw.close();
		*/
	}

}
