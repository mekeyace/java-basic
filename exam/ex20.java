package exam;
//추상클래스 응용편 - ex_ab.java
/*
  응용문제1
  해당 프로세서를 실행시 현재 날짜와 시간이 출력되는 코드를 작성하시오.
  단, 해당 날짜와 시간을 abstract에서 return 받아서 출력 되도록 합니다.
  결과예시 : 2024-05-24 09:45:22
*/
public class ex20 {
	public static void main(String[] args) {
		new ex20_box().today();
	}
}

class ex20_box extends ex_ab{
		public void today() {
				String db_date = super.datecheck("yyyy-MM-dd hh:mm:ss");
				System.out.println(db_date);
		}
}




