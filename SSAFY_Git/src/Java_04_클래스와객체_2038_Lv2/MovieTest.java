package Java_04_클래스와객체_2038_Lv2;

public class MovieTest {
public static void main(String[] args) {
	Movie movie1 = new Movie();
	
	// 값 넣기
	movie1.id = 104;
	movie1.title = "주토피아";
	movie1.director = "디즈니";
	movie1.genre = "애니메이션";
	movie1.runningTime = 140;
	
	// 출력
	System.out.println("영화 id : " + movie1.id);
	System.out.println("영화 제목 : " + movie1.title);
	System.out.println("영화 감독 : " + movie1.director);
	System.out.println("영화 장르 : " + movie1.genre);
	System.out.println("영화 러닝타임 : " + movie1.runningTime);
	
	
	
	}
}
