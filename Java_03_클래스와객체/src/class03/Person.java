package class03;

public class Person {
	
	//데이터 필드를 초기화하지 않으면 -> 기본값이 들어가있다!
	// 클래스에서 사용하는 멤버 변수 : 초기화 필수 X
	// <-> 지역변수 : 초기화 필수
	
	String name;
	int age = 1000;
	String hobby;

	//기능(매개변수 X)
	void info() {
		System.out.printf("나의 이름은 %s,입니다. %n나이는 %d세, 취미는 %s입니다.%n", name, age, hobby);

	}
	
	//기능(매개변수(파라미터) O)
	void study(int time) {
		//int time = ?(호출 시 넘겨준 값)
		System.out.println(time + "시간 만큼 공부했습니다.");
	}
	
	//메서드 오버로딩
	//이름 같으면서, 매개변수가 다른 메서드 (파라미터의 타입, 개수, 순서가 달라야 함)
	
	void study(long time) {
		
	}
	
	void study(double time) {
		
	}

	void study(int time1, int time2) {
		
	}
	
//	void study(int time2, int time1) { // 안 됨. 파라미터명은 신경쓰지 않고 int형 2개가 있다고만 컴파일러가 인식함.
//		
//	}
	
	//에러 안 나는 사례 : 순서가 다르면 에러 안 남!
	void study(String str, int time) { 
		
	}
	
	void study(int time, String str) {
		
	}
	
}















