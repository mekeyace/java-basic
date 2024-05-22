package io;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 i/o 기초 응용편
 파일은 gugu.txt로 java에서 생성 되어야 하며, 사용자가 다음과 
 같이 입력을 합니다.
 
 "구구단을 입력하세요 : "
gugu.txt에 사용자가 입력한 구구단을 모두 출력 되어야 합니다.
예시)
6 을 입력시
6*1=6
6*2=12
6*3=18
...
6*9=54 
   
 */
public class file5 {
	public static void main(String[] args) throws Exception {
		new file5_box().abc();
	}
}
class file5_box{		//io, nio : try~catch
	Scanner sc = new Scanner(System.in);
	FileWriter fw = null;
	File f = null;
	
	public void abc() throws Exception{
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\gugu.txt";
			this.f = new File(url);
			this.f.createNewFile(); //파일 생성
			System.out.println("구구단 숫자 하나를 입력하세요 : ");
			int gugu = this.sc.nextInt();
			this.fw = new FileWriter(url,true);
			//filewriter 시 : int, Integer, double, float 해당 숫자형은 데이터 저장시 글자깨짐
			int w = 1;
			while(w <= 9) {
				int sum = gugu * w;	//산술
				this.fw.write(gugu+"*"+w+"="+sum+"\n");
				w++;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			this.sc.close();
			this.fw.close();
		}
	}
	
	
}






