package week2.day1Assignment;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle ;

	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");

	}
	
	public static void main(String[] args) {
		
		Library mybook = new Library();
		String bookTitle = "Book is";
		String book = mybook.addBook(bookTitle + " " +"Rich dad poor dad");
		System.out.println(book);
		mybook.issueBook();

	}

}
