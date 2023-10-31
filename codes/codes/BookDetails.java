package codes;
import java.util.Scanner;
public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bookNo;
		String title,author;
		float price;
		//Book myBook=new Book();
		Scanner sc=new Scanner(System.in);
		Book books[]=new Book[3];
		for(int i=0;i<3;i++) {
		System.out.println("enter number:");
		bookNo=sc.nextInt();
		sc.nextLine();
		System.out.println("enter Title:");
		title=sc.nextLine();
	System.out.println("enter Author :");
		author=sc.nextLine();
		System.out.println("enter Price:");
		price=sc.nextFloat();
		books[i]=new Book(bookNo,title,author,price);
		
		for(Book book : books) {
			System.out.println(book.toString());
		}
		//System.out.println(myBook.getBookNo()+" "+myBook.getTitle()+" "+myBook.getAuthor()+" "+myBook.getPrice());

	}
		

}
}
