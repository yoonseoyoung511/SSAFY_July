package Java_04_클래스와객체_2038_Lv2;

public class Movie {
	
	//movie 정보 저장
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	//기본 생성자
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	//인자를 받을 생성자
	public Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}	
	
}
