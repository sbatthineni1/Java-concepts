package lists.al;

import java.util.*;

public class DescendingArrayLists {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        for(int i = 0; i < firstArray.length; i++){
            Random  random = new Random();
            firstArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        /*
        [37, 23, 36, 48, 66, 13, 39, 20, 5, 88]
        [5, 13, 20, 23, 36, 37, 39, 48, 66, 88]
         */
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : firstArray)
            list.add(i);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        /*
        [5, 13, 20, 23, 36, 37, 39, 48, 66, 88]
        [88, 66, 48, 39, 37, 36, 23, 20, 13, 5]
         */


    }
}
