package inheritance01_no;

public class Test {
public static void main(String[] args) {
	Person p = new Person(); //가능한 이유 : 기본생성자 자동으로 생성해줌
	Student st = new Student();
	
	//서로 연관 X. 비슷할 뿐 남남
	p.eat();
	st.eat();
}
}
