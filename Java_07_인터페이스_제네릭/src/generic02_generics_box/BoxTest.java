package generic02_generics_box;

//타입을 결정한 박스
class Box<T extends Number> { //숫자만 사용가능!
	private T obj;
	
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
} 

public class BoxTest {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
//		Box<String> box2 = new Box<>(); 
		//위에서 extends Number로 숫자만 들어오게 제한함. 안됨
		
		
	}
}
 