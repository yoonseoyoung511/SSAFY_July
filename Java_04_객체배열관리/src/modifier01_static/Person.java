package modifier01_static;

public class Person {
	
	//클래스 변수(모든 클래스가 공유하는 값)
	static int pCount = 1;
	
	//static 블록
	static {
		System.out.println("클래스 로드 될 때 한번 수행되는 메서드");
	}
	//그냥 블럭 : 객체 2개니까 2번 호출됨.
	//쓰는 이유 : 블록 쓰면 이 안에서 반복문 등 다양한 일처리 됨
	//블럭은 생성자에서 처리해도 됨
	{
		System.out.println("난 몇 번 호출될까요?");
	}
	
	
	//인스턴스 변수(객체마다 고유한 값)
	String name;
	int age;
	String hobby;
	
	public void eat() {
		System.out.println("냠냠");
	}
	
	public static void study() {
	}
}
