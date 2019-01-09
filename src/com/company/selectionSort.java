package com.company;

public class selectionSort {
    public static void SelectionSort(int[] array)
    {
     int min = 1001;
     int indexofmin = 0;
     int hold = 0;

     //First for loop is used to increment the index at which we're checking minimums
      for(int i = 0; i < array.length; i++)
      {
          //Second for loop used to search through the whole array for minimums
          for (int j = i; j < array.length; j++)
          {
              //if a minimum is found store the value and index
              if(array[j] < min)
              {
                  min = array[j];
                  indexofmin = j;
              }
              //once we reached the end of array place the minimum at index i (i will have increased by one every time we do this)
              if (j == array.length-1)
              {
                  hold = array[i];
                  array[i] = min;
                  array[indexofmin] = hold;
                  min = 1001;
              }
          }
      }
    }
}
