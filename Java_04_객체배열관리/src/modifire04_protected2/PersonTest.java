package modifire04_protected2;

import modifire04_protected.Person;

public class PersonTest extends Person { //extends:상속
public static void main(String[] args) {
//	Person p = new Person(); //기본생성자 자동으로 만들어놔서 이거 가능

	//protected 다른 패키지면 상속 관계에서 접근 가능. -> 상속 관계 아니라서 지금은 X
	//public class PersonTest extends Person { 해도 아래 오류.
	//Person p = new Person();이기 때문에.
//	p.age = 100; 	
//	p.info();

	PersonTest pt = new PersonTest(); //기본생성자 자동으로 만들어놔서 이거 가능
	pt.age = 100; 	
	pt.info();

}
}
