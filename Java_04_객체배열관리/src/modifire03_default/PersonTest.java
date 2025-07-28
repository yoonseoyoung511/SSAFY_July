package modifire03_default;

public class PersonTest {
public static void main(String[] args) {
	Person p = new Person(); //기본생성자 자동으로 만들어놔서 이거 가능
	
	p.age = 100; //default 같은 패키지 접근 O
	p.info();
}
}
