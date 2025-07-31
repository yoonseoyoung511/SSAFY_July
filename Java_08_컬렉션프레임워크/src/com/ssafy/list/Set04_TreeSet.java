package com.ssafy.list;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Set04_TreeSet {
	public static void main(String[] args) {
//	Set<Integer> set = new TreeSet<>();

//	참고) 이게 더 좋긴 하다. 시험에 안 나옴.
		NavigableSet<Integer> set = new TreeSet<>();

		// 이진탐색트리(BST)
		set.add(10);
		set.add(20);
		set.add(150);
		set.add(50);
		set.add(25);
		set.add(10);
		set.add(30);

		System.out.println(set); // 정렬된 상태로 출력됨

		System.out.println(set.first());
		System.out.println(set.last()); // 전체에서 가장 큰값, 작은값 찾을 수 있음.set에 다 집어넣고~

		// 근접탐색
		System.out.println(set.lower(30)); // 25 (30 미만이면서 가장 큰 포함X)
		System.out.println(set.floor(30)); // 30 (30 이하이면서 가장 큰)
		System.out.println(set.ceiling(30)); // 25 (30 이상이면서 가장 작은)
		System.out.println(set.higher(30)); // 25 (30 초과이면서 가장 작은)

		System.out.println(set.descendingSet()); // set. 배열 아님
		System.out.println(Arrays.toString(set.toArray())); // 배열

	}
}
