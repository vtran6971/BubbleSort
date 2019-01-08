package com.company;

public class selectionSort {
    public static void SelectionSort(int[] array)
    {
      int indexofMin = 0;
      int i = 0;
      int hold = 0;

            for (int j = i; j < array.length; j++)
            {
                if(array[j] < array[j+1])
                {
                  indexofMin = j;
                }
                if(j == array.length-2)
                {
                    hold = array[i];
                 array[i] = array[indexofMin];
                 array[indexofMin] = hold;
                 i++;
                 j = i;
                }
                if(i == array.length-1)
                {
                    j = array.length;
                }
            }
    }
}
