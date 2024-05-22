package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//파일 내용을(nio) -> 배열로 저장

public class file8 {

	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		//io 형태로 배열 저장
		/*
		FileReader fr = new FileReader(url);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> data = new ArrayList<String>();
		String msg = "";
		while((msg = br.readLine())!=null) {
			data.add(msg);
		}
		br.close();
		fr.close();
		*/
		
		/*
		//List interface 구성 형태로 nio 배열 저장
		List<String> data = new ArrayList<String>();
		data = Files.readAllLines(Paths.get(url));
		*/
		/*
		//Class 구성 형태로 addAll을 이용하여 nio 배열 저장
		ArrayList<String> data = new ArrayList<String>();
		data.addAll(Files.readAllLines(Paths.get(url)));
		*/
		
		/*   //byte를 이용한 배열 형태 -> 문자열로 변환
		String word = "abc";
		byte data[] = word.getBytes();		//ASCII 코드로 배열에 저장
		String unbox = new String(data);
		System.out.println(unbox);
		*/
		
		//byte + nio를 활용
		byte data[] = Files.readAllBytes(Paths.get(url));
		String unbox = new String(data);
		System.out.println(unbox);		
	}

}
