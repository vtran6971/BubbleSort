package com.company;

public class selectionSort {
    public static void SelectionSort(int[] array)
    {
      int min = 1001;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if(array[j] < min)
                {
                  min = array[j];
                }
                if(j == array.length-1)
                {
                 array[i] = min;
                 j = array.length;
                }
            }
        }
    }
}
