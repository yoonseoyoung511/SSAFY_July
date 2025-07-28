
public class sdfs {
public static void main(String[] args) {
	X x1 = new X();
	X x2 = new X();
}
}

class X { //클래스의 구성요소 : 변수, 메서드, 생성자, 초기화블럭, 또다른 생성자
	int i; //인스턴스 변수, non-static
	static int s; // static. 클래스변수, 공통변수, 공유변수
	{ // 인스턴스 초기화블럭 : 모든 인스턴스가 생설될 때, 생성자 호출 전에 실행됨
	//각각 생성자에서 해야할 일이 공통적으로 있을 대 그 부분을 인스턴스 초기화 블럭에서 진행
		System.out.println("인스턴스 초기화블럭" + i + ", " + s);
	}
	static {
		System.out.println("static 초기화블럭" + s);
	}
	public X() {
		System.out.println("기본생성자");
	}
	public X(int i) {
		this.i = i;
		System.out.println("매개변수가 있는 생성자");
	}
}
