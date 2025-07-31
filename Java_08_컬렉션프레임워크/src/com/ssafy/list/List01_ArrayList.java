package com.ssafy.list;

//ctrl shift o : 자동 import
import java.util.ArrayList;
import java.util.List;

public class List01_ArrayList {
public static void main(String[] args) {
//	List : 순서 O / 중복 O
	
//	ArrayList<String> names = new ArrayList<>();
	ArrayList<String> names = new ArrayList<>();
	
	List<String> names2 = new ArrayList<>();
	
	//원소추가
	names.add("유");
	names.add("정");
	names.add("정");
	names.add(2,"KIM"); //2번자리 원래 있던거 밀고 kim이 들어간다
	names.add(1000, "KIM");
	

	for(String name : names) {
		System.out.println(name);
			
	}
	
	System.out.println("--------------------------");
	
	for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i));
		
	}
	
	System.out.println(names);
	
	
	//전체를 비우는 법
//	1. 인스턴스를 새로 만든다.
//	2. 전체를 반복 돌면서 하나씩 제거하기
//	3. clear()
	names.set(1, "양명균");
	
	names.remove("윤정아");
	System.out.println(names);
	
	names.clear();
	System.out.println(names.isEmpty());	
	
	
	
	
	}
}
