package day26_constructor;

	public class Book {

		String title;
		String author;
		int year;
		String isbn;
		int pages;
	
	
	public Book (String title, String author, int year, String isbn, int pages) {

		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.pages = pages;
}
	
	public String getBookInfo () {
	
			String bookInfo = "Book title: " + title + ", Author: " 
						+ author + ", Publishing year: "+ year + ", ISBN#: "+ 
							isbn+ ", Page count: " + pages;
	
	
	return bookInfo;
}
	
}
