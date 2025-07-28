package abstract_class04_anonymous_class;

public class Test {
	public static void main(String[] args) {
		//cook() -> 추상메소드이므로 인스턴스 생성 불가능함.
		//1회 한정으로 미완성인 부분 구현해줌으로써, 인스턴스 생성할 수 있게 해준다
//		== 익명클래스 라고 함!!
		Chef chef = new Chef() {
			//일회성. 한번 쓰고 버릴 것 : 클래스 만들지 말고 이렇게 한 번 메소드 쓰고 버리기.
			//계속 쓸 것 : 클래스 새로 만들어서 사용하기.
			@Override
			public void cook() {
				System.out.println("랜덤요리 가능");
			}
		};
		chef.eat();
		chef.cook();
	}
}