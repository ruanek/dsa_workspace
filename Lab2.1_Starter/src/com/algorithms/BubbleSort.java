package com.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
       int[] input = {4, 15, 2, 6, 9, 22, 13};
       System.out.println(Arrays.toString(input));
       sort(input);
       System.out.println(Arrays.toString(input));
    }

    /*
    bubbleSort(array)
       n = length(array)
       for (k = 1 until n)
         for (j = 0 until length-1)
           if(array[j] > array[j + 1])
             swap(array, j, j + 1)
    */
    public static void sort(int[] numbers){
       // TODO-Lab2.1: implement pseudo-code above
    }
    
}
