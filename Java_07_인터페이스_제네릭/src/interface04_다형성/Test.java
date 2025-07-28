package interface04_다형성;

public class Test {
public static void main(String[] args) {
	KFoodChef k = new KFoodChef();
	k.cook();
	
	//참조타입으로 Chef 사용가능 -> 다형성!
	Chef chef = new KFoodChef(); //Chef는 인터페이스 / KFoodChef는 클래스
	chef.cook(); //동적 바인딩
	
	//익명클래스 문법으로 1회한정 구현 가능 -> 쓸일 가끔 있음.
	//방법 : Chef chef2 = new Chef() 하고 중괄호열고 ;찍으면 override할 수 있음!
	Chef chef2 = new Chef() {

		@Override
		public void cook() {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	
	}
}
