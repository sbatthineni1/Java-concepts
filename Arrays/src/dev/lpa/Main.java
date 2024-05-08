package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = (int) 3.1;
        intArray[1] = Integer.parseInt("1");
        intArray[5] = 50;
        System.out.println(Arrays.toString(intArray));
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(firstTen.length);

        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }


        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        for(int i : newArray){
            System.out.print(i + " ");

        }
        System.out.println(Arrays.toString(newArray));
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = new double[] {2.4, 5.6, 7.7, 4};
        System.out.print(Arrays.toString(objectArray));

    }
}
