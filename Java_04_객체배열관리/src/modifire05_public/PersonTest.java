package modifire05_public;

public class PersonTest {
public static void main(String[] args) {
	Person p = new Person(); //기본생성자 자동으로 만들어놔서 이거 가능
	
	p.age = 100; //public : 오픈. 접근 가능
	p.info();
}
}
