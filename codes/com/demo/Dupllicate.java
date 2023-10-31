package com.demo;
import java.util.stream.IntStream;
public class Dupllicate {

	public static void main(String[] args) {
		int nums[]= {9,4,6,5,7,4};
		int []newNum=IntStream.of(nums).distinct().toArray();
		for(int i :newNum)System.out.println(i);

	}

}
