package modifier01_static;

public class PersonTest {
public static void main(String[] args) {
	Person p = new Person();
	
//	pCount에 노란줄(경고) : p(인스턴스)보다 클래스 이름으로 호출하는 게 좋음.
	System.out.println(p.pCount++); 

	Person p2 = new Person();
//	인스턴스 생성 안해도 사용 가능. 클래스 변수
	System.out.println(Person.pCount);
	
	p.eat();
//	p.study(); // 인스턴스 객체와 무관하게 메모리에 올라감 (static 붙어 있음)
	Person.study(); // static 붙어 있음 -> 클래스 이름으로 바로 접근도 가능!
	
	
	
	
	
//	static 있으면 그냥 이렇게만 바로 써도 됨. 알고에서 씀.
	add(1,2);
	
//	static 없으면 인스턴스 만들어야 함.
//	PersonTest pt = new PersonTest();
//	pt.add(0, 0);
//
//}
//
	
}

public static int add(int a, int b) {
	return a+b;
}
}