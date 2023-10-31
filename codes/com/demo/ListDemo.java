
package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class ListDemo {

	public static void main(String[] args) {
	List myList=new ArrayList();
	myList.add(1);
	myList.add("Akula");
	myList.add("Tejesh");
	myList.add(new Date());
	System.out.println(myList.contains("Akula"));
	System.out.println(myList);
	myList.remove(0);
	System.out.println(myList);
	myList.add(0,"mr");
	System.out.println(myList);
	myList.set(0, "welcome");
	System.out.println(myList);
	for(Object i:myList)
		System.out.println(i);
	

	}

}
