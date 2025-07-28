import java.util.Random;

public class SsafyRoutine {
	public static void main(String[] args) {
		System.out.println("아침에 일어난다.");
		이동("교육장", "셔틀버스");
//		boolean 과제 = 교육();
		이동("집", "어디로든 문");
//		if(과제 == true) -> X. 과제가 어차피 boolean이니까 비교 x
//		if(과제)
		if(교육()) // -> 바로 조건식 안에 함수써도 됨.
			System.out.println("과제를 해결한다.");
		System.out.println("잠을 잔다.");
	}
	// 함수
	// - 관련된 문장들을 하나로 묶은 것 (이름을 붙인 것)
	// - 하나하나가 실행 가능한 단위
	
	//반환 값
	public static boolean 교육() {
		System.out.println("오전 수업(Live)을 듣는다.");
		System.out.println("점심을 먹는다.");
		System.out.println("오후 수업(실습)을 진행한다.");
		return new Random().nextBoolean(); //true/false 랜덤으로 발생시킴
	}
	
	public static void 이동(String 장소, String 교통수단) {
		System.out.println(장소 + "(으)로 " + 교통수단 + "를(을) 이용하여 이동한다.");
	}
}
