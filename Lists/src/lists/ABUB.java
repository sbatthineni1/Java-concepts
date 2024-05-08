package lists;

import java.util.Arrays;

public class ABUB {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[1] = 50;
        System.out.println(Arrays.toString(intArray));


        Integer[] integerArray = new Integer[5];
        integerArray[1] = 50;
        System.out.println(Arrays.toString(integerArray));
        System.out.println(integerArray[1].getClass().getName());

       
    }
}
