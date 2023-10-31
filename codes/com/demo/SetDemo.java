package com.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> mySet=new HashSet<Integer>();
		mySet.add(9);
		mySet.add(8);
	
	int sum=0;
		for(Integer i:mySet)
		{
			sum+=i;
		}
    System.out.println(sum);
	}

}