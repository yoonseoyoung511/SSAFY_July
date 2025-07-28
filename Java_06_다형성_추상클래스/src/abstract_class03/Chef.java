package abstract_class03;

public abstract class Chef {
	String name;
	int age;
	
	//추상클래스에 일반 메서드도 존재할 수 있다 -> 상속받아서 구현의 강제성 x
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
//	미완성인 추상메서드를 생성했다.
//	상속받고 있는 쉐프들은 구현의 강제성을 받게 됨. 실수방지 가능 -> 굿
//	추상메소드 -> 클래스도 추상클래스해야 함
	public abstract void cook();
	
	
}
