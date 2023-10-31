package com.demo;

import java.util.stream.IntStream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		int nums[]= {9,4,6,5,7,4};

	

		int minValue=IntStream.of(nums).min().getAsInt();
		System.out.println("min value:"+minValue);
		int maxValue=IntStream.of(nums).max().getAsInt();
		System.out.println("max value:"+maxValue);

		//System.out.println( IntStream.of(nums).distinct().count());

		//int[] newArray=IntStream.of(nums).distinct().toArray();

		//for(int i:newArray)System.out.println(i);

		//System.out.println(minValue);

	}

}
