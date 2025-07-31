package com.ssafy.pjt;

public class Test {
	public static void main(String[] args) {
		StudentManager mgr = StudentManagerImpl.getManager();

		Student st1 = new Student("양띵균", "컴퓨터공학", "Java 비전공");
		Student st2 = new Student("양땅균", "컴퓨터공학", "Java 비전공");
		Student st3 = new Student("양떵균", "컴퓨터공학", "Java 비전공");
		Student st4 = new Student("양땡균", "컴퓨터공학", "Java 비전공");
		Student st5 = new Student("양뚱균", "컴퓨터공학", "Java 비전공");
		mgr.add(st1);
		mgr.add(st2);
		mgr.add(st3);
		mgr.add(st4);
		mgr.add(st5);

//	for(Student st : mgr.getAll()) {
//		System.out.println(st);
//	}

		for (Student st : mgr.searchName("양띵균"))
			System.out.println(st);

		Student st6 = new Student("양명균", "경제학", "Java 비전공");
		st6.setStudentID(15); // 5번 갈아낌. 15여도 문제 없음

		try {
			mgr.update(st6); // void : 리턴해도 줄 수 있는 정보 없음. -> 예외 던져봐도 될듯? -> try catch
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}

		mgr.delete(3);

		for (Student st : mgr.getAll())
			System.out.println(st);
		
		mgr.saveData();

//	System.out.println(mgr.getStudent(100));

	}
}
