package inheritance03_super;

class Parent {
	String name = "부모님 이름";
	
	void eat() {
		System.out.println("냠냠");
	}
}


class Child extends Parent {
	String name = "자식 이름";
	
	void eat() {
		super.eat();
		System.out.println("쩝쩝");
	}
	
	void printName() {
		
		String name = "익명"; //메소드 안에 이름 같은 변수 있으면 그거 먼저 찾아감. 
		//자식 이름 말고 "익명" 출력됨.
		
//		System.out.println(name);
//		System.out.println(name1); 
//		System.out.println(name2);  //구분하려고 부모, 자식 변수 이름 바꾸는 건 의미 없음.
		System.out.println(super.name); //부모
		System.out.println(this.name);  //자식
	}
}

public class SuperTest {
public static void main(String[] args) {
	Child child = new Child();
	child.printName(); 
	child.eat(); //냠냠, 쩝쩝 둘다 출력
}
}
