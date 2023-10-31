package codes;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new  StringBuffer();
		for(int i=0;i<20;i++) {
			sb.append(i);
			sb.append(" ");
		}
System.out.println(sb.toString());
sb.reverse();

System.out.println(sb.toString());
	}

	}


