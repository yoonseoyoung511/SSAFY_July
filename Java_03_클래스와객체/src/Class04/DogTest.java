package Class04;
/**
 * 오버로딩(Overloading) 
 * : 하나의 클래스 내에서 동일한 메서드명 사용을 허용
 *   매개변수의 개수, 타입, 순서가 달라야 한다. 이 중 뭐 하나라도 달라야 함.
 * 	 리턴타입은 의미 없음.	
 * 		ex.	System.out.println(dog3.name + dog3.age); //매개변수 O
			System.out.println(); //매개변수 X
					
 */


public class DogTest {
public static void main(String[] args) {
	Dog dog = new Dog(); // 생성자 정의했으면 기본생성자 안 만들어짐 -> 오류남.
//	생성자 정의 안했으면 오류 안 남.
//	
	dog.name ="마루";
	dog.age = 5;
	dog.info();
//	dog.abc();
	

	Dog dog2 = new Dog("마리", 5);
	Dog dog3 = new Dog(10); //age만 입력. name은 기본 그대로 나옴.
	System.out.println(dog3.name + dog3.age); //매개변수 O
	System.out.println(); //매개변수 X
	
}
}
