package day26_constructor;

public class ObjBook {

	public static void main(String[] args) {

		Book book1 = new Book ("How To Win Friends & Influence People", 
									"Dale Carnegie", 
									1936, 
									"978-0-671-02703-2", 284 );
		
		System.out.println(book1.getBookInfo());
		
		
	}

}
