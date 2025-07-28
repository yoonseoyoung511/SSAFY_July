package Java_06_상속과다형성_2011_Lv3;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	public Book() {
	}

	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
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

//	public String toString() {
//		return isbn + "," + title + "," + author + "," + publisher + "," + price + "," + desc + "]";
//	}
	
	
}
