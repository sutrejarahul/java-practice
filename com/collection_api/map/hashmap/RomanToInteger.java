package com.collection_api.map.hashmap;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "XIV";
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));

            // If the current value is less than the next value, subtract it
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }
}

