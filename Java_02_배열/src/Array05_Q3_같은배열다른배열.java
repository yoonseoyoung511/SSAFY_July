import java.util.Iterator;

public class Array05_Q3_같은배열다른배열 {
	public static void main(String[] args) {
		int[] a = {3,5,1,2,7,3,9};
		int key = 7;
		// a배열에 key 값이 들어 있음? -> O
		
		boolean flag = false; // 있는지 없는지 체크할 flag 변수 / 초기값 : 없음.
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				flag = true;
				break; //중복되면 한번만 나오고 빠져나오기. 3 있음있음으로 나오는거 방지.
			} 
		}
		if(flag) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		
		// 배열 비교 - 기본형
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 5 };
		boolean same = true; // 같음?
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i]) {
				same = false;
				break;
			}			
		}
		if(same) {
			System.out.println("두 배열은 같다");
		} else {
			System.out.println("두 배열은 다르다");
		}
		//위 if문 한 줄로 줄이기 : 삼항연산자
		System.out.println("두 배열은 " + (same ? "같다" : "다르다"));
		

		// 배열 비교 - 참조형 (인덱스로 가면 주소가 저장되어 있음 -> 내용물 비교 : equals 메소드)
		String[] arr3 = { "pig", "cow", "fish" };
		String[] arr4 = { "pig", "dog", "cat" };
		boolean st = true; // 같음?
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i] != arr2[i]) {
				st = false;
				break;
			}			
		}
		if(st) {
			System.out.println("두 배열은 같다");
		} else {
			System.out.println("두 배열은 다르다");
		}
		//위 if문 한 줄로 줄이기 : 삼항연산자
		System.out.println("두 배열은 " + (st ? "같다" : "다르다"));

	}
}
