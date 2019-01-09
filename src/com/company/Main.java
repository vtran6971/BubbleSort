package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a random array of integers
        int[] testArr = BubbleSort.randomIntArr(10);
        int[] testArr2 = BubbleSort.randomIntArr(10);
        int[] afterArr = testArr.clone();
        int[] afterArr2 = testArr2.clone();

        //Prints out array before sort
        System.out.print("Before BubbleSort: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using bubbleSort
        BubbleSort.bubbleSort(testArr);

        //Prints out array after sort
        System.out.print("After BubbleSort: ");
        for (int num:testArr)
            System.out.print(num+" ");
        System.out.println();
        if(BubbleSort.checkSum(testArr, afterArr) == true)
        {
            System.out.println("Sum before and after sort are equal");
        }

        //Prints out array before SelectionSort
        System.out.println();
        System.out.print("Before SelectionSort: ");
        for (int num:testArr2)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using SelectionSort
        selectionSort.SelectionSort(testArr2);

        //Prints out array after SelectionSort
        System.out.print("After SelectionSort: ");
        for (int num:testArr2)
            System.out.print(num+" ");
        System.out.println();
    }
}
