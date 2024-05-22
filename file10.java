package io;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

//io File, nio Files : 파일 복사
public class file10 {

	public static void main(String[] args) throws Exception {
		String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";
		String url2 = "D:\\webpage\\agree\\src\\main\\java\\io\\agree2.txt";
		//io + nio 복사
		/*
		File f1 = new File(url);		//오리지널 파일
		File f2 = new File(url2);	//복사할 파일
		Files.copy(f1.toPath(), f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
		*/
		
		//io + nio 복사2   (r : 읽기 w : 쓰기 x : 실행)
		//RandomAccessFile : 해당 파일 권한에 맞춰서 쓰기, 읽기 설정하는 클래스 
		RandomAccessFile f3 = new RandomAccessFile(url, "r");
		RandomAccessFile f4 = new RandomAccessFile(url2, "rw");
		
		//FileChannel : nio 클래스 (파일 읽기, 쓰기, 맵핑)
		FileChannel fc = f3.getChannel();
		System.out.println(fc.size());		//원본파일 용량확인
		FileChannel fc2 = f4.getChannel();
		
		fc.transferTo(0, fc.size(), fc2);	//transferTo  데이터 0byte ~ 크기만큼 내용 복사
		
		
		
		
		
		
		
	}

}
