package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class DescendingArray {
    public static void main(String[] args) {
        int[] s1Array = randomArray(5);
        int n = s1Array.length;

        System.out.println(Arrays.toString(s1Array));
        Arrays.sort(s1Array);
        System.out.println(Arrays.toString(s1Array));
        s1Array = sortedArray(s1Array);
        System.out.println(Arrays.toString(s1Array));

//        for (int i = 0; i < n; i++) {
//            s2Array[n - i] = s1Array[i];
//        }
//        System.out.println(Arrays.toString(s2Array));


    }

    private static int[] randomArray(int len) {

        Random random = new Random();
        int[] s1 = new int[len];
        for (int i = 0; i < len; i++) {
            s1[i] = random.nextInt(100);
        }
        return s1;

    }

    private static int[] sortedArray(int[] array) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    flag = true;
                }

            }

        }
        return sortArray;

    }
}
