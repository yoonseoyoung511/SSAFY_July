package modifire03_default;

//defalut : 같은 패키지 안에서 접근 가능. 암것도 안 쓰면 default
public class Person {
	String name;
	int age;
	
	void info() {
		this.name = "Yang";  //나는 내부니까 접근 가능함
	}
}
