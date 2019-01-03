package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int count = 1;
        int hold;
        int i = 0;
        int j = 1;

        while (count > 0) {
            if (arr[i] > arr[j]) {
                hold = arr[j];
                arr[j] = arr[i];
                arr[i] = hold;
                i++;
                j++;
                count++;
            }
            else
            {
                i++;
                j++;
            }

            if(j == arr.length && count > 1)
            {
                i = 0;
                j = 1;
                count = 1;
            }
            if(j == arr.length && count == 1)
            {
                count = 0;
            }
        }
        }

}
