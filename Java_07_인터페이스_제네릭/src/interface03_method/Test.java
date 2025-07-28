package interface03_method;

public class Test {
	
	public static void main(String[] args) {
//		MyInterface1 i = new MyInterface1(); 이런거 안 됨
		MyClass1 c = new MyClass1();
		
		c.method2();
		
		MyClass3 c3 = new MyClass3();
		c3.method3();
		
//		c3.method4(); -> static 메서드는 안됨. 인터페이스 이름으로 불러와라!
		MyInterface2.method4();
	}

}
