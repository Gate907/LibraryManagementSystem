import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Library lib=new Library();
		
		Book b;
		User u;
		
		int ch;
		do {
			System.out.println("\n--- Library Menu ---");
			System.out.println("1. Add Book");
			System.out.println("2. Add User");
            System.out.println("3. View Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Users");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            ch=sc.nextInt();
            
            switch (ch) {
			case 1:
			{
				System.out.println("Enter Book Name :");
				String bnm=sc.next();
				System.out.println("Enter Author Name :");
				String auth=sc.next();
				b=new Book(bnm,auth);
				
				lib.addBooks(b);
				break;
			}
			case 2:
			{
				System.out.println("Enter User Name :");
				String unm=sc.next();
				u=new User(unm);
				
				
				lib.addUser(u);
				
				break;
			}
			case 3:
			{
				lib.viewBooks();
				break;
			}
			case 4:
			{
				System.out.println("Enter Booked Name :");
				String title=sc.next();
				System.out.println("Enter User Id :");
				String uid=sc.next();
				lib.issueBook(title, uid);
				
				break;
			}
			case 5:
			{
				System.out.println("Enter Name For Returning the Book :");
				String bnm=sc.next();
				lib.returnBook(bnm);
				
				break;
			}
			
			case 6:
			{
				lib.viewUsers();
				break;
			}
				

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=7);
	}

}
