package com.dsa.structures.skillsoft;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{1,2,3};
        
        constantFunction(intArray);

        linearFunction(intArray);        
        anotherLinearFunction(intArray);
    }

    // Constant time complexity that is O(1)
    private static void constantFunction(int[] intArray) {
        System.out.println("Argument is: " + intArray.toString());
    }

    // Linear time complexity that is O(N)
    private static void linearFunction(int[] intArray) {
        for (int i : intArray) {
            System.out.println("Number: " + i + ", Square: " + i*i);
        }
    }
    
    // Linear time complexity that is O(N)
    private static void anotherLinearFunction(int[] intArray) {
        if(intArray.length % 2 != 0) {
            // this is O(1)
            System.out.println("The length of an array is odd");
        } else {
            // this is O(N), and because we consider worst case (even length array in this case),
            // this will be the time complexity of this function
            for (int i : intArray) {
                System.out.println("Number: " + i + ", Square: " + i*i);
            }    
        }
    }
}
