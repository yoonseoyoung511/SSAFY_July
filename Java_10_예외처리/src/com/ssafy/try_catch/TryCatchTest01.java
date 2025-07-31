package com.ssafy.try_catch;

public class TryCatchTest01 {
	public static void main(String[] args) {
		int[] nums = { 10 }; // 선언과 동시에 초기화할 때만 가능한 문법

		try {
			System.out.println("정상 코드 1");
			// 코드는 엄청나게 많이 쓸거야!!
			System.out.println(10 / 0); // 수학적 이슈 예외 발생
			System.out.println(nums[10]); // 예외가 발생할 수도 있는 코드
			System.out.println("정상 코드 2");
			// catch 먼저 나온 게 출력됨.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 예외처리 구문");
		} catch (ArithmeticException e) {
			System.out.println("수학적 이슈 예외처리 구문");
		}
		System.out.println("프로그램 끝");

		//예외는 다형성 처리가 가능하다
		//조상 먼저 작성해버리면 -> 아래 코드들은 동작할 기회 잃어버림
		try {
			System.out.println("정상 코드 1");
			// 코드는 엄청나게 많이 쓸거야!!
			System.out.println(10 / 0); // 수학적 이슈 예외 발생
			System.out.println(nums[10]); // 예외가 발생할 수도 있는 코드
			System.out.println("정상 코드 2");
			// | 이용해서 연결 가능
		} catch (Exception e) {
			System.out.println("이외의 모든 예외처리 구문");
			e.getMessage();
			e.printStackTrace();
			}
		System.out.println("프로그램 끝");
	} 
}
