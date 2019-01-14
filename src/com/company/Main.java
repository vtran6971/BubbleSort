package com.company;


public class Main {

    public static void main(String[] args) {
        //Creation of arrays
        int[] beforeBubbleArr = Utilties.randomIntArr(10);
        double[] beforeSelectionArr = Utilties.randomDoubleArr(10);
        int[] beforeInsertionArr = Utilties.randomIntArr(10);
        String[] stringArray = Utilties.randomStringArr(10, 4);
        //Creates copies of the arrays above
        int[] afterArr = beforeBubbleArr.clone();
        double[] afterArr2 = beforeSelectionArr.clone();
        int[] afterArr3 = beforeInsertionArr.clone();
        String[] afterArray = stringArray.clone();
        int[] copyArr0 = beforeBubbleArr.clone();
        int[] copyArr1 = beforeBubbleArr.clone();
        int[] copyArr2 = beforeBubbleArr.clone();

        long timeStart = 0;
        long timeStop = 0;

        //************************************************
        //Prints out a string array
        System.out.println("Before string Bubblesort: ");
        for (String num:stringArray)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using a string bubbleSort
        BubbleSort.bubbleSortStrings(afterArray);

        //Prints out string array after sort
        System.out.println("After string Bubblesort: ");
        for (String num:afterArray)
            System.out.print(num+" ");
        System.out.println();

        //************************************************
        //Prints out int array1 before sort
        System.out.println();
        System.out.print("Before BubbleSort: ");
        for (int num:beforeBubbleArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using int bubbleSort
        timeStart = System.nanoTime();
        BubbleSort.bubbleSort(afterArr);
        timeStop = System.nanoTime() - timeStart;

        //Prints out int array after sort
        //Checks whether the array has the same sum as before sort and if the elements are indeed sorted
        System.out.print("After BubbleSort: ");
        for (int num:afterArr)
            System.out.print(num+" ");
        System.out.println();
        Utilties.checkSum(beforeBubbleArr, afterArr);
        Utilties.isSorted(afterArr);
        System.out.println("Bubblesort takes "+ timeStop + " nanoseconds");

        //************************************************
        //Prints out array2 before SelectionSort
        System.out.println();
        System.out.print("Before SelectionSort: ");
        for (double num:beforeSelectionArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using SelectionSort
        selectionSort.doubleSelectionSort(afterArr2);

        //Prints out array after SelectionSort
        System.out.print("After SelectionSort: ");
        for (double num:afterArr2)
            System.out.print(num+" ");
        System.out.println();
        Utilties.doublecheckSum(beforeSelectionArr, afterArr2);
        Utilties.doubleisSorted(afterArr2);

        //************************************************
        //Prints out array3 before InsertionSort
        System.out.println();
        System.out.print("Before InsertionSort: ");
        for (int num:beforeInsertionArr)
            System.out.print(num+" ");
        System.out.println();

        //Sorts using insertionsort
        InsertionSort.insertionSort(afterArr3);

        //Prints out array after Insertion
        System.out.print("After InsertionSort: ");
        for (int num:afterArr3)
            System.out.print(num+" ");
        System.out.println();
        Utilties.checkSum(beforeInsertionArr, afterArr3);
        Utilties.isSorted(afterArr3);

        System.out.println();
        timeStart = System.nanoTime();
        BubbleSort.bubbleSort(copyArr0);
        timeStop = System.nanoTime() - timeStart;
        System.out.println("Bubblesort takes " + timeStop + " nanoseconds");

        System.out.println();
        timeStart = System.nanoTime();
        selectionSort.SelectionSort(copyArr1);
        timeStop = System.nanoTime() - timeStart;
        System.out.println("Selectionsort takes " + timeStop + " nanoseconds");

        System.out.println();
        timeStart = System.nanoTime();
        InsertionSort.insertionSort(copyArr2);
        timeStop = System.nanoTime() - timeStart;
        System.out.println("Insertionsort takes " + timeStop + " nanoseconds");
    }
}
