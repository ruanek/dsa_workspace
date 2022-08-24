package com.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Intersection {

    public List<Integer> intersection(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>(a.length);
        for (int x : a) {
            for (int y : b) {
                if (x == y) result.add(x);
            }
        }
        return result;
    }

	public List<Integer> intersectionFast(int[]a, int[]b){
		// TODO-Lab1.4: Implement fast intersection logic here
        List<Integer> result = new LinkedList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int indexA = 0, indexB = 0; indexA < a.length && indexB < b.length; ){
            int valueA = a[indexA];
            int valueB = b[indexB];
            if (valueA == valueB) {
                result.add(valueA);
                indexA++;
                indexB++;
            } else if (valueA < valueB) {
                indexA++;
            } else {
                indexB++;
            }
        }
        return result;
	}

    public List<Integer> intersectionHash(int[]a, int[]b){
        // TODO-Lab1.4: Implement fast intersection logic here
        List<Integer> result = new LinkedList<>();
        Set<Integer> setA = IntStream
                .of(a)
                .boxed()
                .collect(Collectors.toSet());
        return IntStream
                .of(b)
                .boxed()
                .filter(setA::contains)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));

        Intersection simpleIntersectionFast = new Intersection();
        System.out.println(simpleIntersectionFast.intersectionFast(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));

        Intersection simpleIntersectionHash = new Intersection();
        System.out.println(simpleIntersectionHash.intersectionHash(new int[]{4, 7, 5, 2, 3}, new int[]{4, 2, 3, 9, 1}));

    }
}
