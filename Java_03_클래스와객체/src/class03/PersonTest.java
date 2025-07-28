package class03;

public class PersonTest {
	public static void main(String[] args) {
		// Yang 생성하자!
		// 객체 생성 : 클래스이름 변수이름 = new 클래스이름();
		Person yang = new Person();
		yang.name = "Yang";
		yang.age = 45;
		yang.hobby = "Youtube";
		
		Person hong = new Person();
		hong.name = "Hong";
//		hong.age = 25;
//		hong.hobby = "Golf";
//		
//		yang.info();
//		hong.info();
		
		//아래에 작성된 100 = 인자. argument
		yang.study(100);
		
		short s = 20;	
		yang.study(s);
		yang.study((byte)10);
		
//		long l = 1000;
//		yang.study(l); -> 묵시적 형변환 x (int보다 long 데이터 범위가 더 큼)
		
		

		
	}
	

}
