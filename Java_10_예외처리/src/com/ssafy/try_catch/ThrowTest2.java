package com.ssafy.try_catch;

public class ThrowTest2 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	public static void method2() throws ClassNotFoundException {
		//Unchecked 계열을 발생시키자!
		//1. 직접 처리하는 방법 (try~catch)
		//2. 간접 처리 (throws) -> 나를 호출한 곳으로 던져!
		int i = 1/0; // 0으로 나누는 것을 허용하지 않는다!
	}
	
	
	
}
