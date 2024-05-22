package _05_ArrayListEx;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	Book() {}
	Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this. publisher = publisher;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getTitle() {
		return title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	String getAuthor() {
		return author;
	}
	
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	String getPublisher() {
		return publisher;	
	}
	 public String toString() {
		   return "제목 : "+this.title + ", 저자 : "+this.author + ", 출판사 : "+this.publisher;
		   }

}
