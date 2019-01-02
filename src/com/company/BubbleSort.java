package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        int count = 0;
        int hold;
        int i = 0;
        int j = 1;

        while(count < arr.length)
        {
            if (arr[i] < arr[j])
            {
                hold = arr[j];
                arr[j] = arr[i];
                arr[i] = hold;
            }
            i++;
            j++;
            if(j== arr.length)
            {
                count=arr.length;
            }
        }
    }
}
