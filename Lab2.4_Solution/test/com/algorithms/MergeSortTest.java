package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSortPositive() {
        int[] unsortedArray = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        int[] sortedArray = new int[]{1, 3, 4, 5, 16, 17, 21, 33};
        new MergeSort().mergeSort(unsortedArray);
        for (int a=0; a<unsortedArray.length; a++){
            assertEquals(sortedArray[a], unsortedArray[a]);
        }
    }

    @Test
    public void mergeSortNullArrayPositive() {
        int[] unsortedArray = null;
        try {
            new MergeSort().mergeSort(unsortedArray);
        }
        catch(Exception e){
            fail("Exception thrown");
        }
    }

    @Test
    public void mergeSortEmptyArrayPositive() {
        int[] unsortedArray = new int[]{};
        int expectedSize = 0;
        try {
            new MergeSort().mergeSort(unsortedArray);
        }
        catch(Exception e){
            fail("Exception thrown");
        }
        assertEquals(expectedSize, unsortedArray.length);
    }

}