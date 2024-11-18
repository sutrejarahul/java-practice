package com.collection_api.map.treemap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.SortedMap;
import java.util.TreeMap;

public class UsingTreeMapForRangeQueries {

    public static void main(String[] args) {
        TreeMap<LocalDate, String> treeMap = new TreeMap<>();

        // Add entries to the TreeMap
        treeMap.put(LocalDate.of(2023, 1, 1), "New Year's Day");
        treeMap.put(LocalDate.of(2023, 2, 14), "Valentine's Day");
        treeMap.put(LocalDate.of(2023, 3, 20), "Spring Equinox");
        treeMap.put(LocalDate.of(2023, 4, 22), "Earth Day");
        treeMap.put(LocalDate.of(2023, 5, 1), "May Day");
        treeMap.put(LocalDate.of(2023, 6, 21), "Summer Solstice");
        treeMap.put(LocalDate.of(2023, 7, 4), "Independence Day");
        treeMap.put(LocalDate.of(2023, 9, 22), "Autumnal Equinox");
        treeMap.put(LocalDate.of(2023, 10, 31), "Halloween");
        treeMap.put(LocalDate.of(2023, 12, 25), "Christmas Day");

        // Print the TreeMap entries in sorted order by date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("All Events:");
        treeMap.forEach((key, value) -> System.out.println(key.format(formatter) + " - " + value));

        // Define the range for events in between two dates
        LocalDate startDate = LocalDate.of(2023, 2, 14);
        LocalDate endDate = LocalDate.of(2023, 9, 23);  // endDate is exclusive in subMap, so one day after desired date

        SortedMap<LocalDate, String> events = treeMap.subMap(startDate, endDate);

        System.out.println("\nEvents between '14-02-2023' and '22-09-2023':");
        events.forEach((key, value) -> System.out.println(key.format(formatter) + " : " + value));
    }
}

