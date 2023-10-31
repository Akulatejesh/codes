package codes;


public class Book {
	private int bookNo;
private static int bookCount;
	
	static
	{
		bookCount=0;
	}
	Book()
	{
		bookCount++;
	}
	Book(int bNo,String btitle,String bauthor,float bprice)
	{
		if(btitle.length()>=4)
		{
			
			this.title=btitle;
			
		}
		else
		{
			System.out.println("title is invalid");
		
		}
		this.bookNo=bNo;
		this.author=bauthor;
		if(bprice>=1 && bprice<=5000)
		{
			this.price=bprice;
		}
		else
		{
			System.out.println("price is invalid");
		}
		bookCount++;
	}
	public static int getBookCount()
	{
		return bookCount;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	private String title;
	private String author;
	private float price;
	
	/*Book(){
		bookNo=12;
		title="python";
		author="teju";
		price=400.0f;
	}*/
	
}


