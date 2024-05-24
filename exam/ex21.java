package exam;
/*
응용문제2
회사 직원들에게 급여를 이체 할려고 합니다. 회사 직원 데이터는 다음과 같으며, 
모두 이체 후 총 이체금액이 출력 되도록 합니다.
String a[] = {"유재석","신동엽","정상훈","아이유","한지민"};
단, 입금관련 Scanner 작동은 추상 클래스 이며, 
본 class에서 배열에 대한 데이터를 순서대로 호출하게 되며, 
총 이체금액을 출력 되도록 합니다.

출력형태
유재석 이체 금액 : 
신동엽 이체 금액 : 
....
한지민 이체 금액 : 

총 이체 금액 : 25000000
 */
public class ex21 {
	public static void main(String[] args) {
		new ex21_box().banks();
	}
}
class ex21_box extends ex_ab{
	String a[] = {"유재석","신동엽","정상훈","아이유","한지민"};
	Integer total = 0;		//입금 최종 합계 금액
	
	public void banks() {
		int w=0;
		while(w < a.length) {
			this.total += super.in_money(a[w]);
			w++;
		}
		super.sc.close();
		System.out.println("총 이체 금액은 : " + this.total);
	}
	
}







