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
                swap(arr, i);
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
        System.out.println("Number of complete iterations = " + cnt);
        }

        //Swaps the value of the current index with the next index's value
        public static void swap(int[] arr, int i) {
            int hold;
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

}
