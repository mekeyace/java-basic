package io;

import java.io.File;
import java.io.FileOutputStream;
/*
[응용문제]

 Stream을 이용하여 구구단 8단 dan.txt 로 저장되도록 합니다.
 8 * 1 = 8
 8 * 2 = 16
 ...
 8 * 9 = 72 
 */

public class file14 {
	public static void main(String[] args) {
			try {
				//파일명 dan.txt
				String url = "D:\\webpage\\agree\\src\\main\\java\\io\\dan.txt";
				File f = new File(url);
				f.createNewFile();
				FileOutputStream os = new FileOutputStream(url);
				int w = 1;
				while(w <= 9 ) {
					int sum = 8 * w;
					String print = "8 * " + w + "=" + sum + "\n";
					byte by[] = print.getBytes();
					os.write(by);
					//os.flush();
					w++;
				}
				os.close();
			}catch(Exception e) {
				e.getMessage();
			}
	}
}






