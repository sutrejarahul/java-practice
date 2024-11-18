package com.collection_api.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateRemoval {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 1, 5, 7, 9, 81, 0);

        HashSet<Integer> uniqueElements = removeDuplicates(list);

        System.out.println(uniqueElements);
    }

    public static HashSet<Integer> removeDuplicates(List<Integer> list) {
        return new HashSet<>(list);
    }
}
