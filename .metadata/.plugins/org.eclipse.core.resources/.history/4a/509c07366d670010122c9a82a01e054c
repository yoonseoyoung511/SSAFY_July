package SWEA;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_2063_중간값찾기_D1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N은 항상 홀수
		int[] numbers = new int[N];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
//		 // 저장된 배열 값 출력
//        System.out.println("입력한 숫자:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
//        }

        // 1. 정렬
        Arrays.sort(numbers);
        
        // 2. 중간값 계산
        int midIndex = numbers.length / 2;
        int mid;
        
        mid = numbers[midIndex];
        
        System.out.println(mid);
        
        sc.close(); // Scanner 닫기
		
	}
}
