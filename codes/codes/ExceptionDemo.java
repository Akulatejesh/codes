package codes;

public class ExceptionDemo {

	public static void main(String[] args)throws InterruptedException {
		int a,b,c=0;
		try
		{
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("invalid");
		}
		catch(ArithmeticException ex) {
			System.out.println("invalid2");
		}
		catch(NumberFormatException ex) {
			System.out.println("invalid3");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		Thread.sleep(1000);
		System.out.println("result:"+c);

	}

}
