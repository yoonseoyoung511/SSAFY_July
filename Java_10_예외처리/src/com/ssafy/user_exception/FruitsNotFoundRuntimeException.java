package com.ssafy.user_exception;

public class FruitsNotFoundRuntimeException extends Exception {
	
	public FruitsNotFoundRuntimeException(String name) {
		super(name+"에 해당하는 과일은 실행시점에 없다");
	}
}
