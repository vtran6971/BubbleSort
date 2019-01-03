package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        boolean loop = true;
        boolean swaps = false;
        int hold;
        int i = 0;
        int cnt = 0;

        //Loop that runs while there are still swaps to be potentially made
        while (loop) {
            //iterates through array and checks whether or not to swap
            if (arr[i] > arr[i+1]) {
                hold = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = hold;
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
        System.out.println("Iteration count is " + cnt);
        }

}
