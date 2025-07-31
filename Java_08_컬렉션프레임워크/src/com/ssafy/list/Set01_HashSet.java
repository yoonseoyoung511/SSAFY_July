package com.ssafy.list;

import java.util.Set;
import java.util.HashSet;

public class Set01_HashSet {
public static void main(String[] args) {
	Set<String> set = new HashSet<>();
	
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
