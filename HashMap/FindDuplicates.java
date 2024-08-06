package HashMap;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr1[] = {7, 4, 5, 5, 8, 9, 3, 1};
        int arr2[] = {1, 2, 6, 8, 5, 10, 8};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        // Adding all elements of arr1 to set1
        for (int element : arr1) {
            set1.add(element);
        }

        // Checking for duplicates and adding to duplicates set
        for (int element : arr2) {
            if (set1.contains(element)) {
                duplicates.add(element);
            }
        }

        // Printing the duplicates
        System.out.println(duplicates);
    }
}


// [1, 5, 8]