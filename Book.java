
public class Book {
	private String title,author;
	 boolean isIssued=false;
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	
	}
	public void dispBK() {
		System.out.println("Book [title=" + title + ", author=" + author + ", isIssued=" + isIssued + "]");
	}
	public boolean isIssued() {
		return isIssued;
	}
	
	public void issue() {
		isIssued=true;
	}
	
	public void returnBook() {
		isIssued=false;
	}
	
	

}
