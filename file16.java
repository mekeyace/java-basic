package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/*
 응용문제 1.  
 d:\에 product 디렉토리 상품 4개의 이미지가 있습니다.
 해당 이미지를 d:\\upload라는 디렉토리에 복사 되도록 
 코드를 작성하시오.
 */

public class file16 {	
	public static void main(String[] args) throws Exception {
		//new file16_box().property();
		//new file16_box().dirctory();
		String url = "d:\\product\\";
		String cpurl = "d:\\upload\\";
		
		String data[] = {"pd1.jpg","pd2.jpeg","pd3.jpg","pd4.jpeg"};
		//FileOutputStream os = new FileOutputStream(cpurl);
		int w = 0;
		while(w < data.length) {	//배열 갯수 만큼 반복
			String url_full = url + data[w];		//url + 파일명(배열)
			FileInputStream fs = new FileInputStream(url_full);	//읽음
			byte[] bt = new byte[fs.available()];		//원시 규격 사이즈
			fs.read(bt);		//파일을 전체 읽어들임
			FileOutputStream os = new FileOutputStream(cpurl + data[w]);	//저장경로
			os.write(bt);	//파일저장
			os.flush();		//캐쉬메모리 공간확보
			os.close();
			fs.close();
			w++;
		}
		System.out.println("파일이 정상적으로 업로드 완료 되었습니다.");		
	}
}
//파일 속성 및 디렉토리 리스트
class file16_box{
		//해당 디렉토리에 있는 모든 파일 리스트를 가져오는 코드
		public void dirctory() throws Exception {
			/*
			 서버에 업로드시 동일한 이름이 이미 있을 경우 해당 부분을 조건문으로
			 처리하여 다른 이름으로 저장 되도록 하기위한 목적
			*/
			String url = "d:\\product\\";
			File f = new File(url);
			File allfile[] = f.listFiles();
			System.out.println(Arrays.asList(allfile));
		}
		//파일 속성
		public void property() throws Exception{
			String url = "d:\\product\\pd1.2024.jpg";
			File f = new File(url);
			System.out.println(f.getName());	//파일명
			
			//속성명만 (확장자만 출력)
			String filename = f.getName();
			//해당 단어를 기준으로 맨 마지막에 해당 되는 단어 노드번호
			int n = filename.lastIndexOf(".");		
			String modify = filename.substring(n);	//(단어시작 노드번호, 검색할 단어갯수)
			System.out.println(modify);
		}
}


