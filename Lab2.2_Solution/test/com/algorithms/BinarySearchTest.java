package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearchTargetFoundPositive() {
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expected = true;
        int target = 4;
        boolean actual = BinarySearch.binarySearch(target, sorted);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchTargetNotFoundPositive() {
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expected = false;
        int target = 0;
        boolean actual = BinarySearch.binarySearch(target, sorted);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchNullArrayNegative() {
        int[] sorted = null;
        boolean expected = false;
        int target = 4;
        boolean actual = BinarySearch.binarySearch(target, sorted);
        assertEquals(expected, actual);

    }

    @Test
    public void binarySearchEmptyArrayNegative() {
        int[] sorted = new int[]{};
        boolean expected = false;
        int target = 4;
        boolean actual = BinarySearch.binarySearch(target, sorted);
        assertEquals(expected, actual);
    }

    @Test
    public void binarySearchTargetUnsortedArrayNegative() {
        // this test cannot be implemented reliably.  The method requires a sorted array, and
        // the behavior is undefined if it isn't sorted.
//        int[] sorted = new int[]{2, 1, 8, 4, 9, 6, 7, 3, 5, 10};
//        boolean expected = true;
//        int target = 4;
//        boolean actual = BinarySearch.binarySearch(target, sorted);
//        assertEquals(expected, actual);
    }

}