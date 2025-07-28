package modifire07_object_array;

public class Person { //클래스명 : 어퍼카멜케이스, 파스칼케이스 = 첫글자 대문자
	//외부 접근 불가능
	private String name;
	private int age;
	private String myName; //set,get할 때 어떻게 이름 지어야 됨? -> setMyName
	
	public Person() {
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println(name + ":" + age);
	}
	
	//나이 수정 -> 메서드 구현
	//메서드 이름 관례 : 앞에 set, get 붙이기 + Name (앞글자 대문자)
	
	//설정자(메서드) set(필드명 첫 글자 대문자로)
	public void setAge(int age) {
		
		//무수히 많은 코드 실행시킬 수 있따!
		if (age < 0) {
			System.out.println("나이는 음수 안 됌");
		} else if(age >= 150) {
			System.out.println("뱀파이어?");
		} else {
			this.age = age;
		}		
	}
	
	//접근자 get(필드명 첫 글자 대문자로)
	public int getAge(int age) {
		return age;
	}
	
	public String getMyName() {
		return myName;
	}
	
}
