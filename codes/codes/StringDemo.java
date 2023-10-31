package codes;

public class StringDemo {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.concat("world"));
		System.out.println(str.replace('l', 'k'));
         str="  hel  llo  ";
         System.out.println(str.length());
         str=str.trim();
         System.out.println(str.length());
         System.out.println(str.contains("he"));
         
         
	}

}
