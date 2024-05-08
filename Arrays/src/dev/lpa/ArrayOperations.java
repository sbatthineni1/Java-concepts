package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] firstArray = RandomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 17);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = RandomArray(10);

        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(fourthArray));

        fourthArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(fourthArray));

/* output
[30, 57, 36, 58, 47, 11, 75, 47, 69, 71]
[11, 30, 36, 47, 47, 57, 58, 69, 71, 75]
[17, 17, 17, 17, 17, 17, 17, 17, 17, 17]
[39, 0, 12, 22, 71, 4, 67, 13, 62, 65]
[39, 0, 12, 22, 71]
[39, 0, 12, 22, 71, 4, 67, 13, 62, 65, 0, 0, 0, 0, 0]
 */
    }

    private static int[] RandomArray(int len) {
        Random random = new Random();
        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }
        return newArray;
    }
}
