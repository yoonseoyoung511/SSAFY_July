package interface03_method;

public interface MyInterface1 {
	//추상 메서드
	void method1();
	
	// 구현의 강제성 X.
	default void method2() {
		System.out.println("MyInterface1 -> default method");
	}
}
