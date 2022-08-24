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
        if (numbers == null) return;
        int n = numbers.length;
        int count = 0;
        for (int k = 1; k<n; k++){
            for (int j=0; j<numbers.length-1; j++){
                count++;
                if (numbers[j] > numbers[j+1]){
                        int tmp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = tmp;
                }
            }
        }
        System.out.println("Iterations for array of length " + numbers.length + ": " + count );
    }

}
