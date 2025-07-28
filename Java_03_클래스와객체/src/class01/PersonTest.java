package class01;
/**
 * ex) number of apples
 * 		-> numberOfApples
 * 상수 final : 상수명은 모두 대문자 & 사이사이 언더바로 구분 NUMBER_OF_APPLES
 * 
 * 자바의 식별자는 카멜케이스로 작성된다
 * 		첫글자
 * 변수   소문자
 * 메서드	 소문자()   -> 변수, 메서드() 구분
 * 클래스  대문자
 * 생성자  대문자()   -> 클래스, 생성자() 구분
 * 패키지  
 * 프로젝트
 *  
 */


public class PersonTest {
public static void main(String[] args) {
	// 사람의 정보를 관리하자!
	
	String name1 = "Yang";
	int age1 = 45;
	String hobby1 = "Youtube";
	
	String name2 = "Hong";
	int age2 = 25;
	String hobby2 = "Golf";

	// 사람 100명이면 너무 힘들다!
	// 배열 ! (서울 16반 윤서영)
	int size = 100;
	String[] names = new String[size];
	int[] ages = new int[size];
	String[] hobbies = new String[size];
	
	names[0] = "Yang";
	names[1] = "Hong";
	ages[0] = 45;
	ages[1] = 25;
	hobbies[0] = "Youtube";
	hobbies[1] = "Golf";
	
	
	
	
	
	
}
}
