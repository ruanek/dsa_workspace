package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionTest {
    Intersection intersection = new Intersection();

    @Test
    public void testIntersectionPositive() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testFullIntersectionFullOverlapPositive() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{66, 24, 75, 22, 12, 87};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24, 75, 22, 12, 87);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testEqualIntersectionAllValuesIdenticalPositive() {
        int[] numbers1 = new int[]{2, 2, 2, 2};
        int[] numbers2 = new int[]{2, 2, 2, 2};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(2, 2, 2, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testNoIntersectionPositive() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }

    // TODO-Lab1.5: Implement additional tests as necessary
}