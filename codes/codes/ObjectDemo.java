package codes; 







class Box{
	private int size;
	public Box() {
		size=0;
	}
	public Box(int size) {
		this.size=size;
	}
	public String toString() {
		return "size is"+ size;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=new Box(5);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		if(b1==b2) {
			System.out.println("equal");
			
		}
		else {
			System.out.println("notequal");
		}
		

	}

}
