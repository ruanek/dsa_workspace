package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {
/*
success path(s)
	non-empty non-null unsorted array sorted in correct order
failure path(s)
	empty array
	null array
	pre-sorted array
	array w/duplicates */
    @Test
    public void sortPositive() {
        int[] array = {3, 7, 2, 15, 8, 4, 6, 5, 1};
        BubbleSort.sort(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 15);
        HashSet<Integer> actual = new HashSet<Integer>();
        actual.addAll(expected);

        assertEquals(new HashSet<>(expected), actual);
    }

    @Test
    public void sortNullArrayPositive() {
        int[] array = null;
        BubbleSort.sort(array);
        HashSet<Integer> actual = null;
        List<Integer> expected = null;

        assertEquals(expected, actual);
    }

    @Test
    public void sortEmptyArrayPositive() {
        int[] array = {};
        BubbleSort.sort(array);
        HashSet<Integer> actual = new HashSet<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        actual.addAll(expected);
        assertEquals(new HashSet<>(expected), actual);
    }

    @Test
    public void sortPreSortedPositive() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        BubbleSort.sort(array);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 15);
        HashSet<Integer> actual = new HashSet<Integer>();
        actual.addAll(expected);

        assertEquals(new HashSet<>(expected), actual);
    }

    @Test
    public void sortArrayWithDupsPositive() {
        int[] array = {3, 7, 2, 15, 8, 15, 6, 3, 1};
        BubbleSort.sort(array);
        List<Integer> expected = Arrays.asList(3, 7, 2, 15, 8, 15, 6, 3, 1);
        HashSet<Integer> actual = new HashSet<Integer>();
        actual.addAll(expected);

        assertEquals(new HashSet<>(expected), actual);
    }

}