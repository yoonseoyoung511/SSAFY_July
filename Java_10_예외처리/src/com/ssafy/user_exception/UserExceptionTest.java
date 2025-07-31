package com.ssafy.user_exception;

public class UserExceptionTest {
	public static String[] fruits = { "망고", "수박", "복숭아" };

	public static void main(String[] args) {
		// 과일 장사를 해보자~~

		try {
			sell2("사과");
		} catch (FruitsNotFoundRuntimeException e) {
			System.out.println(e.getMessage());
		}
	}	

// 런타임 계열은 알아서 던져짐. throw 굳이 안 써도 됨.
	private static boolean sell2(String name) { 
		//과일 목록을 찾아서 그거 판매해야 된다.
		for(int i = 0; i<fruits.length ; i++) {
			if(name.equals(fruits[i])) {
				//해당 라인 수행된다는 것은... 과일 있어!
				System.out.println("판매 완료!");
				fruits[i] = null; 
				return true; 
			}
		}
//		return; //컴파일러가 void면 알아서 return 넣어줌
		throw new FruitsNotFoundRuntimeException(name);
	}
}
