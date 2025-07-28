package inheritance04_overriding;

public class Person {
	String name;
	int age; //private이면 상속받았다 하더라도 접근 불가
	
	public void eat() {
		System.out.println("음식을 냠냠 먹는다.");
	}
	
	public Person() {
//		super(); //생략되어 있음 : object. 생략해도 컴파일러가 알아서 넣음
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
