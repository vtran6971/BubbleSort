package com.company;

public class Utilties {

    //Swaps the value of the current index with the next index's value
    public static void swap(int[] arr, int i) {
        int hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }

    //Swaps the string at the current index with the next index's string
    public static void swapString(String[] arr, int i)
    {
        String hold;
        hold = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i] = hold;
    }

    //Generates an array with random numbers 0-1000
    //Array length is based on input count
    public static int[] randomIntArr (int count)
    {
        int[] arr = new int[count];
        for (int i = 0; i<count; i++)
        {
            arr[i] = (int)(Math.random()*1001);
        }
        return arr;
    }

    /*public static int[] randomStringArr (int count)
    {
        String[] array = new String[count];
        for (int i = 0; i<count; i++)
        {
            array[i] =
        }
        return array;
    }*/

    //Checks the sum of the array before and the sum of array after
    //If the sums are equal then returns true otherwise false
    public static Boolean checkSum(int[] before, int[] after)
    {
        int sumBefore = 0;
        int sumAfter = 0;
        Boolean sumCheck;

        for (int i = 0; i < before.length; i++)
        {
            sumBefore += before[i];
        }

        for (int j = 0; j < after.length; j++)
        {
            sumAfter += before[j];
        }

        if (sumBefore == sumAfter)
        {
            sumCheck = true;
        }
        else
        {
            sumCheck = false;
        }

        return sumCheck;
    }
}
