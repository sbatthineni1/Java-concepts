package dev.lpa;

import java.util.Arrays;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];
        System.out.println(arr1[0].length);
        System.out.println(Arrays.deepToString(arr1));
        // output = 4
        for(int i = 0; i < arr1.length; i++) {
            var inner = arr1[i];
            for (int j = 0; j < inner.length; j++) {
                arr1[i][j] = (i * 10) + (j + 1);
            }
        }


        System.out.println(Arrays.deepToString(arr1));

        for(var outer : arr1){
            for(var inner : outer){
                System.out.print(inner + " ");
            }
            System.out.println();
        }

        arr1[1] = new int[] { 11,22,33};
        System.out.println(Arrays.deepToString(arr1));


    }
}
