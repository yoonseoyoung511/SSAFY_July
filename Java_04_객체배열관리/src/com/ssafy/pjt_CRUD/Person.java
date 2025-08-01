package com.ssafy.pjt_CRUD; //가장 최상단에 위치해야함 (폴더 비슷한 구조)

/////////////////////////////////////
//import가 들어오는 자리 -> 여러개 올 수 있음
// 기본으로 들어있는 패키지 : import java.lang.*;

/////////////////////////////////////아래와 같이 작성하면 bin/3개의 .class 파일이 생성됨.
class Test1 {
	
}

class Test2 {
	
}

//public class는 딱 1개만 올 수 있다
public class Person {
	//설계할 때 이건 꼭 있으면 좋아!
	//id -> 고유한 식별자
	private String name; //고유 식별자로 사용하기로 함
	private int age;
	private int height;
	private String mbti;
	private boolean hungry;
	
//	기본 생성자
	public Person() {
	}
	
//	전체필드 초기화 생성자
	public Person(String name, int age, int height, String mbti, boolean hungry) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.mbti = mbti;
		this.hungry = hungry;
	}
	
////////////////////
//	접근자&설정자 get&set
	public void setName(String name) {
		this.name = name;
		return; //생략가능 void 라서!
	}
	
//	반환 타입 String -> return 필수!
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMbti() {
		return mbti;
	}

	public void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

//	정보를 보이자! info() -> toString() 메서드를 사용하더라
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", mbti=" + mbti + ", hungry=" + hungry
				+ "]";
	}
	
	
	
	
	

}
