package com.collection_api.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();

        // 1. add(E e) - Adds the specified element to the set if it is not already present.
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set after adding elements: " + set);

        // 2. addAll(Collection<? extends E> c) - Adds all elements from the specified collection to the set.
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Date");
        anotherSet.add("Elderberry");
        set.addAll(anotherSet);
        System.out.println("Set after addAll: " + set);

        // 3. contains(Object o) - Returns true if this set contains the specified element.
        System.out.println("Set contains 'Apple': " + set.contains("Apple"));

        // 4. containsAll(Collection<?> c) - Returns true if this set contains all elements of the specified collection.
        System.out.println("Set contains all elements of anotherSet: " + set.containsAll(anotherSet));

        // 5. isEmpty() - Returns true if this set contains no elements.
        System.out.println("Is the set empty? " + set.isEmpty());

        // 6. size() - Returns the number of elements in the set.
        System.out.println("Size of the set: " + set.size());

        // 7. remove(Object o) - Removes the specified element from the set if it is present.
        set.remove("Banana");
        System.out.println("Set after removing 'Banana': " + set);

        // 8. removeAll(Collection<?> c) - Removes from this set all of its elements that are contained in the specified collection.
        set.removeAll(anotherSet);
        System.out.println("Set after removing all elements of anotherSet: " + set);

        // 9. retainAll(Collection<?> c) - Retains only the elements in this set that are contained in the specified collection.
        set.add("Date");
        set.add("Elderberry");
        set.retainAll(anotherSet);
        System.out.println("Set after retainAll with anotherSet: " + set);

        // 10. clear() - Removes all of the elements from this set.
        set.clear();
        System.out.println("Set after clear: " + set);

        // 11. iterator() - Returns an iterator over the elements in this set.
        set.add("Fig");
        set.add("Grape");
        System.out.println("Elements in the set using iterator:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 12. toArray() - Returns an array containing all elements in this set.
        Object[] array = set.toArray();
        System.out.print("Elements in the array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }

        // 13. toArray(T[] a) - Returns an array containing all elements in this set; the runtime type of the returned array is that of the specified array.
        String[] stringArray = set.toArray(new String[0]);
        System.out.print("\nElements in the stringArray: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
    }
}
