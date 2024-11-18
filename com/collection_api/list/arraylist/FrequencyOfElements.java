package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class FrequencyOfElements {

    public static void main(String[] args) {
        // 1. Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        // 2. printing the frequency of each element in the list
        ArrayList<String> countedElements  = new ArrayList<>();
        for (String fruit: list) {
            if(countedElements.contains(fruit)) {
                continue;
            }

            int count = 0;
            for (String s : list) {
                if (s.equals(fruit)) {
                    count++;
                }
            }
            countedElements.add(fruit);
            System.out.println(fruit+":"+ count);
        }

    }
}
