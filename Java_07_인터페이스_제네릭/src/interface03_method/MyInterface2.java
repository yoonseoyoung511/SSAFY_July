package interface03_method;

public interface MyInterface2 {
	// 구현의 강제성 X.
	default void method2() {
		System.out.println("MyInterface2 -> default method");
	}
	default void method3() {
		System.out.println("MyInterface2 -> default method3");
	}
	
	static void method4() {
		System.out.println("static method입니다");
	}
}
