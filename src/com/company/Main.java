package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creation of arrays and a copy of each
        int[] beforeBubbleArr = Utilties.randomIntArr(10);
        int[] beforeSelectionArr = Utilties.randomIntArr(10);
        int[] beforeInsertionArr = Utilties.randomIntArr(10);
        String[] stringArray = Utilties.randomStringArr(10, 4);
        int[] afterArr = beforeBubbleArr.clone();
        int[] afterArr2 = beforeSelectionArr.clone();
        int[] afterArr3 = beforeInsertionArr.clone();
        String[] afterArray = stringArray.clone();

        ///////////////
        //Prints out a string array
        System.out.println("Before string Bubblesort: ");
        for (String num:stringArray)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using a string bubbleSort
        BubbleSort.bubbleSortStrings(afterArray);

        //Prints out array after sort
        System.out.println("After string Bubblesort: ");
        for (String num:afterArray)
            System.out.print(num+" ");

        ////////////////////////////////////////////
        //Prints out array1 before sort
        System.out.println();
        System.out.print("Before BubbleSort: ");
        for (int num:beforeBubbleArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using bubbleSort
        BubbleSort.bubbleSort(afterArr);

        //Prints out array after sort
        //Checks whether the array has the same sum as before sort and if the elements are indeed sorted
        System.out.print("After BubbleSort: ");
        for (int num:afterArr)
            System.out.print(num+" ");
        System.out.println();
        Utilties.checkSum(beforeBubbleArr, afterArr);
        Utilties.isSorted(afterArr);


        /////////////////////////////////////////////
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
