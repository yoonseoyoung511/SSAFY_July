package Class04;

class Com {
	int price;
	public Com() {
		// TODO Auto-generated constructor stub
	}
}

//모든 클래스는 반드시 하나 이상의 생성자를 가져야 한다.
//클래스에 생성자가 하나도 없으면, 컴파일러가 기본생성자를 추가해준다.
//생성자를 작성하면, 컴파일러는 더이상 기본생성자를 추가해주지 않는다.
//모든 생성자의 첫번째 줄에는 다른 생성자를 호출하는 코드가 있어야 한다.
//		ex. public Dog(int age) {
//		this("뽀삐", age); // 또다른 생성자 호출
//생성자 첫번째 줄에 다른 생성자 호출 코드가 없으면, 컴파일러가 super()를 추가해준다. (상속에서 또 배울 예정)
//this : 나 자신을 가리키는 참조변수
//		this를 통해서 접근할 수 있는 것은, (지역변수는 불가) 멤버변수 이상을 참조할 수 있다.
//ex. Dog.java
//	void abc() {
//			int x = 3333;
//		}
//	DogTest.java
//		dog.abc(); -> int x 호출 불가. 밖에서 int x 선언해놓고, this 이용해야만 가능함.

//참조의 기본원칙 : 참조위치에서 가장 가까이 선언된 것을 참조한다. (상속에서 다시 할 예정)
//	public Dog(String name, int age) {
//		name = "서민규";
//		this.name = name; // this.name = 인스턴스 필드에 있는 name이야!
//		this.age = age;
//	}



public class Dog {

	String name;
	int age;
	
//	기본생성자가 자동으로 추가된다! 아래가 자동으로 있는 것과 같음.
//	★ 기본생성자는 습관처럼 만들기를 권장!! ★
//	 방법 : Ctrl + Space + Enter
	public Dog() {
		
	}

	public Dog(int age) {
		this("뽀삐", age); // 또다른 생성자 호출
		this.name = "똘똘이"; // 아래에서 똘똘이로 바꿨으니 똘똘이가 출력. -> this()는 항상 최상단에 있어야 한다.

//		this.age = age;
//		this.name = null; // 이런거 하지마. 원래 null임.
//		this.name = "똘똘이";
	}
	
//	public Dog(String n, int a) {
//		name = n;
//		age = a;
//	}
	
	//but 이렇게 생성자를 정의하는 순간 기본생성자는 추가되지 않음.
	public Dog(String name, int age) {
		name = "서민규";
		this.name = name; // this.name = 인스턴스 필드에 있는 name이야!
		this.age = age;
	}
	
	void info() {
		System.out.println(name + ", " + age);
	}
	
	void abc() {
		int x = 3333;
	}


 }

	