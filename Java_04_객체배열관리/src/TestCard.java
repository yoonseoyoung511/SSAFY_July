//static 활용
public class TestCard {
	public static void main(String[] args) {
		Card c1 = new Card(7, "하트", 10, 20);
		Card c2 = new Card(1, "다이아", 10, 20);
		Card c3 = new Card(2, "스페이드", 30, 40);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}

class Card{
	int num;
	String kind;
	static int w; // class Area에 메모리 생성된다,
	static int h; //공통변수, 공유변수, class 변수, static 변수
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(int num, String kind, int w, int h) {
		this.num = num;
		this.kind = kind;
		this.w = w;
		this.h = h;
		
	}
	@Override
	public String toString() {
		return "Card [num=" + num + ", kind=" + kind + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	
	
	
	
}

