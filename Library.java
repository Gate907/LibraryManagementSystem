
import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> bk=new ArrayList<Book>();
	List<User> us=new ArrayList<User>();
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		us.add(user);
	}
	
	public void addBooks(Book book) {
		bk.add(book);
	}
	
	public void issueBook(String title,String uid) {
		for(Book b:bk) {
			if(b.getTitle().equalsIgnoreCase(title)&& !b.isIssued()) {
				b.issue();
				System.out.println("Book issued successfully to User ID: " + uid);
				return;
			}
		}
		System.out.println("Book not found");
	}
	public void returnBook(String title) {
		for(Book b:bk) {
			if(b.getTitle().equalsIgnoreCase(title)&& b.isIssued()) {
				b.returnBook();
				System.out.println("Book are returned successfully...");
				return;
			}
		}
		System.out.println("Book was not issued or doesn't exist.");
	}
	
	public void viewBooks() {
		for(Book b:bk) {
			b.dispBK();
		}
	}
	
	public void viewUsers() {
		for(User b:us) {
			b.dispUs();
		}
	}

}
