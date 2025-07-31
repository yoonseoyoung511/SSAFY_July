package com.ssafy.user_exception;

public class FruitsNotFoundException extends Exception {
	
	public FruitsNotFoundException(String name) {
		super(name+"에 해당하는 과일은 없다");
	}
}
