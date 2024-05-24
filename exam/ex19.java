package exam;
//추상 클래스 (abstract) => extend 이용하여 로드
public class ex19 {
	public static void main(String[] args) {
			new ex19_member(100).abc();	//은닉화
	}
}
class ex19_member extends ex19_box{
	public ex19_member(int a) {
		super();	//상속 받는 내용을 받아서 처리하는 super
		System.out.println(a);
	}
	@Override
	public void bbb() {
	}

	@Override
	public void bbb(int a) {
	}
}


//오버라이드 : Override => 추상클래스에서 선언한 메소드 
//오버로드 : Overload  => 추상클래스 외에 메소드 생성해서 사용
/*
 1. 메소드 : default, public, protected는 사용가능
 2. 필드에 변수선언 : public, protected는 사용가능
     단, abstract에서 private으로 처리하는 변수일 경우 사용가능
 3. abstract에서 즉시 실행 메소드는 abstract를 이용하여 사용불능  
 4. 즉시실행 메소드 호출시 abstract 메소드가 아닌 실제 클래스 즉시 실행 메소드를 호출
   */
abstract class ex19_box{	
	private String data = "";
	public ex19_box() {
		System.out.println("즉시실행!!");
	}
	
	protected void abc() {
		this.data = "홍길동";
		System.out.println(this.data);
	}	
	abstract public void bbb();		//필수로 사용해야하는 메소드
	abstract public void bbb(int a);	
}