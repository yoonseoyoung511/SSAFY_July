package abstract_class04_anonymous_class;

public abstract class Chef {
	String name;
	int age;
	
	//일반 메서드도 존재할 수 있다 -> 상속받아서 구현의 강제성 x
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
//	미완성인 추상메서드를 생성했다.
//	상속받고 있는 쉐프들은 구현의 강제성을 받게 됨. 실수방지 가능 -> 굿
	public abstract void cook();
	
	
}
