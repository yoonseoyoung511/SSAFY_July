package interface01;

public interface MyInterface {
	//추상 메서드를 정의했다! (구현부는 ;로 대체)
	public abstract void method1();
	void method2(); // public abstract 생략되어 있음
	
	//멤버 필드인가? -> 무언가 생략이 되어 있다.
	int NUMBER1 = 100; //이렇게 선언해도 되지만 앞이 생략되어 있는 것.
	public static final int NUMBER2 = 1000; //상수처리
	
}
