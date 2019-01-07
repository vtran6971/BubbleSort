package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a random array of integers
        int[] testArr = BubbleSort.randomIntArr(10);

        //Prints out array before sort
        /*System.out.print("Before: ");
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

        //Program Runtime
        //long time = System.nanoTime();
        long time = System.currentTimeMillis();

        System.out.println("Time Taken: " + time); */

        System.out.print("Before: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        selectionSort.SelectionSort(testArr);

        System.out.print("After: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
    }
}
