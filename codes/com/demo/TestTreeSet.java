package com.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        
        TreeSet<String> productSet = new TreeSet<>();

      
        productSet.add("Product1");
        productSet.add("Product2");
        productSet.add("Product3");
        productSet.add("Product1"); // Adding a duplicate

      
        System.out.println("All Product Names:");
        Iterator<String> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        if (!productSet.isEmpty()) {
            System.out.println("First Product: " + productSet.first());
            System.out.println("Last Product: " + productSet.last());
        } else {
            System.out.println("Product Set is empty.");
        }

        System.out.println("Size of TreeSet: " + productSet.size());

        String productToRemove = "Product2";
        if (productSet.contains(productToRemove)) {
            productSet.remove(productToRemove);
            System.out.println("Removed " + productToRemove + " from the TreeSet.");
        } else {
            System.out.println(productToRemove + " not found in the TreeSet.");
        }

        
        System.out.println("Updated Size of TreeSet: " + productSet.size());
    }
}
