package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        boolean loop = true;
        boolean swaps = false;
        int i = 0;
        int cnt = 0;

        //A Loop that runs while there are still swaps to be potentially made
        while (loop) {
            //Swaps index values if the one on the left is greater than the right value
            if (arr[i] > arr[i + 1]) {
                Utilties.swap(arr, i);
                swaps = true;
            }
            i++;

            //Once iteration reaches end of array go back to the beginning if there are swaps to be potentially made
            if(i == arr.length-1 && swaps == true)
            {
                i = 0;
                swaps = false;
                cnt++;
            }
            //Once iteration reaches end of array ends while loop if there are no more swaps to be made
            if(i == arr.length-1 && swaps == false)
            {
                cnt++;
                loop = false;
            }
        }
        System.out.println("Number of complete iterations = " + cnt); //Used to test number of iterations needed to sort
        }

        public static void bubbleSortStrings (String[] array)
        {
            int test;
            for (int j = 1; j < array.length; j++) {
                for (int i = 0; i != array.length - 1; i++) {
                    test = array[i].compareTo(array[i + 1]);
                    if (test > 0) {
                        Utilties.swapString(array, i);
                    }
                }
            }
        }





}
