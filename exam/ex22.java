package exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
응용문제3
상품을 추가하는 프로세서를 제작해야 합니다.
다음과 같이 프로세서 진행 됩니다. 
(abstract를 이용하여 1차배열이 만들어 지는 프로세서)

"추가할 상품명을 입력하세요 : 선풍기"
"추가할 상품명을 입력하세요 : 선풍기 날개"
"추가할 상품명을 입력하세요 : 종료"  
 [결과]
 [선풍기,선풍기 날개] 
 */
public class ex22 extends ex_ab {
	public static void main(String[] args) {
			new ex22().product();
	}
	public void product() {
		ArrayList<String> result = new ArrayList<String>();
		result = super.arr_make("추가할 쿠폰명을 입력하세요 : ");
		System.out.println(result);
	}
	
}




