package Java_04_클래스와객체_2035_Lv2;

public class UserTest {
public static void main(String[] args) {
	User user1 = new User();
	
	user1.id ="ssafy";
	user1.password = "ssafy";
	user1.name = "박싸피";
	user1.email = "ssafy@ssafy.com";
	user1.age = 28;
	
	// 객체 생성과 동시에 멤버 변수를 초기화 하는 생성자 호출
	User user2 = new User("ssafy","ssafy","박싸피","ssafy@ssafy.com",28);
	
	System.out.println(user1.name);
	System.out.println(user2.name);
	
	
	
//	System.out.println("사용자 id : " + user1.id);
//	System.out.println("사용자 비밀번호 : " + user1.password);
//	System.out.println("사용자 이름 : " + user1.name);
//	System.out.println("사용자 메일 : " + user1.email);
//	System.out.println("사용자 나이 : " + user1.age);
}
}
