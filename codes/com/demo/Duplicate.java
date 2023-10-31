package com.demo;
import java.util.Arrays;
public class Duplicate {
	
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5, 2,1,9};

        
        int tempLength = array.length;
        for (int i = 0; i < tempLength; i++) {
            for (int j = i + 1; j < tempLength; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[tempLength - 1];
                    tempLength--;
                    j--;
                }
            }
        }

        Arrays.sort(array, 0, tempLength);
        System.out.println("The real array is: ");
        for (int i = 0; i < tempLength; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
