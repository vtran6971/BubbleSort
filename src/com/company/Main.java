package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a random array of integers
        //int[] testArr = {8,6,7,5,3,0,9,10,1,2,3};
        int[] testArr = {10,9,8,7,6,5,4,3,2,1,0};

        //Prints out array before sort
        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using bubbleSort
        BubbleSort.bubbleSort(testArr);

        //Prints out array after sort
        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
    }
}
