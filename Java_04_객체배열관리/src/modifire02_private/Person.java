package modifire02_private;

//private : 같은 클래스 내부에서만 접근 가능
public class Person {
	private String name;
	private int age;
	
	private void info() {
		this.name = "Yang";  //나는 내부니까 접근 가능함
	}
}
