package modifire04_protected;

//protected : 같은 패키지 안에서 접근 가능 / 다른 패키지는 상속 관계면 접근 가능
public class Person {
	protected String name;
	protected int age;
	
	protected void info() {
		this.name = "Yang";  //나는 내부니까 접근 가능함 -> ㅇㅋ
	}
}
