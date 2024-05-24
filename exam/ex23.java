package exam;
//ex_interface.java 연동
public class ex23 {
	public static void main(String[] args) {	
		usercheck uc = new usercheck();
		ex23_box gold = new ex23_box();
		ex23_box2 silver = new ex23_box2();
		
		uc.check(gold);
		uc.check(silver);
	}
}
//레벨체크 (1번실행)
class usercheck{
	public void check(user u) {
		System.out.println(u.userlevel());
	}
}

class ex23_box2 implements user{ //(2번실행)
	@Override
	public String userlevel() {
		String level = "실버회원";
		return level;
	}
}
class ex23_box implements user{ //(3번실행)
	@Override
	public String userlevel() {
		String level = "골드회원";
		return level;
	}
}
