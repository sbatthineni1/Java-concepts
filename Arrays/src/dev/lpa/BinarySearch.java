package dev.lpa;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        String[] sArray = {"Ann", "Mark", "Bob", "Liv", "Car", "Dan"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println(Arrays.binarySearch(sArray, "Mark"));

        }
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 5, 4};
        if (Arrays.equals(s1, s2)) {
            System.out.print("Equal");
        } else {
            System.out.print("Not Equal");
        }
    }
}
