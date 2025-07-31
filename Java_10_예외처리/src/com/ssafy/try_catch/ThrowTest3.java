package com.ssafy.try_catch;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

class Parent {
	void method1() throws IOException {
		//코드가 있고 ...
	}
	void method2() throws ClassNotFoundException {
		//코드가 있고 ...
	}
}

class Child extends Parent {
	@Override
	void method1() throws FileNotFoundException {
	}
//	@Override
//	void method2() throws Exception { //자식은 부모보다 더 큰 예외를 던질 수 없다
//	}
}

public class ThrowTest3 {
	public static void main(String[] args) {
		Child c = new Child();
//		c.method1();
	}
	
}
