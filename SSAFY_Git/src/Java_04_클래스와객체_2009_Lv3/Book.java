package Java_04_클래스와객체_2009_Lv3;

/**
 * 도서 정보를 나타내는 클래스
 */

public class Book {
	// 코드를 작성하세요.
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	
	
	public Book() {
		super();
	}



	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}



	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", desc=" + desc + "]";
	}
	
	
	
	
	

//	Book() {
//	}
//
//	// 인수가 있는 생성자 작성 -> 컴파일러는 기본 생성자 추가 X
//	Book(String isbn, String title, String author, String publisher, int price, String desc) {
//		this.isbn = isbn;
//		this.title = title;
//		this.author = author;
//		this.publisher = publisher;
//		this.price = price;
//		this.desc = desc;
//	}
//
//	public String toString() {
//		return isbn + "," + title + "," + author + "," + publisher + "," + price + "," + desc;
//	}

}
