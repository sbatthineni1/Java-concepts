package dev.lpa;

import java.util.Arrays;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
        anotherArray[1] = 2;
        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherArray " + Arrays.toString(anotherArray));
    }
}
