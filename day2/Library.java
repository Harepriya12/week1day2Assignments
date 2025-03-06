package week1.day2;

public class Library {
	
	
	public String addBook(String bookTitle) {
		
			System.out.println("The book title is: "+" " +bookTitle);
		
			System.out.println("Book added successfully");
			return bookTitle;
			
		}

	public void issueBook() {
			System.out.println("Book issued successfully");
		
	}
	public static void main(String[] args) {
		
			Library lib = new Library();
			lib.addBook("Harry potter");
			lib.issueBook();
		
		

	}
	
	

}
