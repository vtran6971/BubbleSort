package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Create a random array of integers
        int[] beforeBubbleArr = Utilties.randomIntArr(10);
        int[] beforeSelectionArr = Utilties.randomIntArr(10);
        int[] beforeInsertionArr = Utilties.randomIntArr(10);
        int[] afterArr = beforeBubbleArr.clone();
        int[] afterArr2 = beforeSelectionArr.clone();
        int[] afterArr3 = beforeInsertionArr.clone();

        ////////////////////////////////////////////
        //Prints out array1 before sort
        System.out.print("Before BubbleSort: ");
        for (int num:beforeBubbleArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using bubbleSort
        BubbleSort.bubbleSort(afterArr);

        //Prints out array after sort
        System.out.print("After BubbleSort: ");
        for (int num:afterArr)
            System.out.print(num+" ");
        System.out.println();
        if(Utilties.checkSum(beforeBubbleArr, afterArr) == true)
        {
            System.out.println("Sum before and after sort are equal");
        }

        ////////////////////////////////////////////
        //Prints out array2 before SelectionSort
        System.out.println();
        System.out.print("Before SelectionSort: ");
        for (int num:beforeSelectionArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using SelectionSort
        selectionSort.SelectionSort(afterArr2);

        //Prints out array after SelectionSort
        System.out.print("After SelectionSort: ");
        for (int num:afterArr2)
            System.out.print(num+" ");
        System.out.println();

        ////////////////////////////////////////////
        //Prints out array3 before InsertionSort
        System.out.println();
        System.out.print("Before InsertionSort: ");
        for (int num:beforeInsertionArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using SelectionSort
        InsertionSort.insertionSort(afterArr3);

        //Prints out array after SelectionSort
        System.out.print("After InsertionSort: ");
        for (int num:afterArr3)
            System.out.print(num+" ");
        System.out.println();
    }
}
