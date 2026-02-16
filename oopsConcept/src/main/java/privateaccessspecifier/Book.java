package privateaccessspecifier;

public class Book {

	private void bookname(String name) {
		
		System.out.println("Book name is"+" "+name);
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.bookname("java");
	}

}
