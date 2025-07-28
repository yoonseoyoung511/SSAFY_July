package inheritance05_final;

public class Test {
public static void main(String[] args) {
	final String[] arr = new String[10];
	
	//final arr은 stack에 걸려 있어서 arr 바꾸는 건 문제됨
	//배열 요소는 힙에 들어있어서 변경 가능
	arr[0] = "Yang";
	arr[1] = "Yoon";
	arr[2] = "Kim";
	
//	arr = new String[100]; // 이런게 안됨.

}
}
