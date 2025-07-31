package com.ssafy.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set03_LinkedHashSet {
public static void main(String[] args) {
	//차이점 : 넣은 순서가 그대로 보장됨!
	Set<String> set = new LinkedHashSet<>();
	
	//추가
	set.add("A");
	set.add("C");
	set.add(null);
	set.add("B");
	set.add("B");
	set.add(null);
	set.add("오유진");
	set.add("사윤진");
	
	System.out.println(set);
	System.out.println(set.contains("A"));
	set.remove("A");
	System.out.println("*****************");
	
	for(String s : set) {
		System.out.println(s);
	}
	
	System.out.println(set.size());
	
	
}
}
