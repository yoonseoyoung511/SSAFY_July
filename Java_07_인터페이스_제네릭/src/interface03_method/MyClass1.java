package interface03_method;

public class MyClass1 implements MyInterface1{

	//구현의 강제성 있는 추상메서드 (구현 안 하면 오류남)
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("클래스에서 재정의한 기본메서드");
	}	
	
	//조상클래스에 있는거!
	public void method3() {
	System.out.println("조상클래스 method3");	
	}
}
