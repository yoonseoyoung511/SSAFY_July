package com.ssafy.pjt;

public class Test2 {
public static void main(String[] args) {
	StudentManager mgr = StudentManagerImpl.getManager();
//	mgr.loadData(); //기본생성자에서 loadData()하면 여기 없어도 실행할 때 뜸!
 	
	for(Student st : mgr.getAll()) {
		System.out.println(st);
	}
}
}
