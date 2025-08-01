package com.ssafy.pjt_CRUD;

public class PersonTest {
public static void main(String[] args) {
	Person p = new Person("양싸피", 50, 190, "ISTP", false);
	Person p2 = new Person("양싸피", 50, 190, "ISTP", false);
	
//	System.out.println(p);

//	PersonManager mgr1 = new PersonManager();
//	PersonManager mgr2 = new PersonManager();
	PersonManager mgr1 = PersonManager.getManager();
	PersonManager mgr2 = PersonManager.getManager();
	
//	System.out.println(1 == 1); //기초자료형에서는 값을 비교
	System.out.println(mgr1 == mgr2); //참조 주소를 비교
	System.out.println(p == p2); //참조 주소를 비교
	System.out.println(0.1+0.1+0.1 == 0.3);
	
	mgr1.addPerson(p);
	mgr1.addPerson(p2);
	
//	for(Person pp : mgr1.getAll()) {
//		System.out.println(pp);
//	}
	
	System.out.println(mgr1.search(null));
	
	for(Person pp : mgr1.getAll()) {
		System.out.println(pp);
//		System.out.println(pp.toString());
	}
}
}
