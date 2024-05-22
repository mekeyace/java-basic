package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//이미지(binary) - stream
/*
 Stream 유의사항
 1. byte[] 변환
 2. InputStream -> read
 3. write -> flush
 */
public class file15 {
	public static void main(String[] args) {
		try {
			//원본이미지
			/*
			String img = "D:\\webpage\\agree\\src\\main\\java\\io\\img.png";
			FileInputStream fs = new FileInputStream(img); //파일을 로드
			byte[] by = new byte[fs.available()];	//이미지 전체 용량 byte
			fs.read(by);		//해당 이미지를 읽은 후 캐시메모리에 저장
			*/
			//복사 이미지 (반복문 없이 처리)
			/*
			String cpimg = "D:\\webpage\\agree\\src\\main\\java\\io\\";
			FileOutputStream os = new FileOutputStream(cpimg+"img2.png");
			os.write(by);	//복사를 시행함
			os.flush();
			os.close();
			*/
			
			//반복문으로 progress를 구현
			String img = "D:\\webpage\\agree\\src\\main\\java\\io\\img.png";
			FileInputStream fs = new FileInputStream(img); //파일을 로드
			byte[] by = new byte[fs.available() / 100];	//이미지 전체 용량 byte
			
			
			String cpimg = "D:\\webpage\\agree\\src\\main\\java\\io\\";
			FileOutputStream os = new FileOutputStream(cpimg+"img2.png");
			
			int i = 0; //읽은 바이트 수
			int check = 0;	//읽은 횟수
			while(true) {	//무한루프 적용
				 i = fs.read(by);	//byte 숫자 (전체용량을 / 100) => 분해해서 용량을 읽어들임
				 if(i == -1) {		//더 이상 읽을 내용이 없을 경우 무한 반복문 종료
					 break;
				 }
				 else {
					//해당 byte만큼 지속적으로 이미지 조합 (byte객체이름,0,읽은 byte 숫자)
					 os.write(by, 0, i);  
				 }
				 check++;
				 if(check % 2 == 0) {			//progress 현재 상황
					 System.out.println(check + "%");
				 }
			}
			os.flush();
			os.close();
			fs.close();
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}
