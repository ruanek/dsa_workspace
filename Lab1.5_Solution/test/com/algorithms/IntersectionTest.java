package com.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class IntersectionTest {
    Intersection intersection = new Intersection();

    @Test
    public void testIntersectionDifferentContents() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{32, 41, 98, 66, 39, 24};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testFullIntersectionIdenticalContentsPositive() {
        int[] numbers1 = new int[]{66, 24, 75, 22, 12, 87};
        int[] numbers2 = new int[]{66, 24, 75, 22, 12, 87};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(66, 24, 75, 22, 12, 87);

        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    public void testEqualIntersectionIdenticalContentsInAllElementsPositive() {
        int[] numbers1 = new int[]{2, 2, 2, 2};
        int[] numbers2 = new int[]{2, 2, 2, 2};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(2, 2, 2, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyIntersectionNoCommonPositive() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 6, 9, 0, 8};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyIntersectionEmptyArraysPositive() {
        int[] numbers1 = new int[]{};
        int[] numbers2 = new int[]{};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList();

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyIntersectionSameArrayPostive() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = numbers1;

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = new ArrayList<Integer>();
        for (int a=0; a<numbers1.length; a++){
            expected.add(numbers1[a]);
        }

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyIntersectionDifferentSizesPositive() {
        int[] numbers1 = new int[]{2, 4, 1, 3, 5};
        int[] numbers2 = new int[]{7, 3, 0};

        List<Integer> result = intersection.intersectionFast(numbers1, numbers2);

        List<Integer> expected = Arrays.asList(3);
        assertEquals(expected, result);
    }
}
