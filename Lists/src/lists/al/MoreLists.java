package lists.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
        // causes below error for list.add("yogurt");
        /*
        List.Of() This method transformed array of strings to list of strings.
        [apples, bananas, milk, eggs]
        lists belong to class java.util.ImmutableCollections$ListN
        Exception in thread "main" java.lang.UnsupportedOperationException
	         */
        ArrayList<String> a1 = new ArrayList<>(list);
        a1.add("yogurt");
        System.out.println(a1);
        /*
        [apples, bananas, milk, eggs, yogurt]
         */
        ArrayList<String> nextList = new ArrayList<>(List.of("milk", "butter", "cheese"));
        System.out.println(nextList);
        a1.addAll(nextList);
        System.out.println(a1);
        System.out.println("Third item in the list - "+a1.get(2));
        System.out.println(a1.contains("butter"));
        a1.removeAll(List.of("butter", "milk"));
        System.out.println(a1);
        a1.remove(1);
        System.out.println(a1);
        a1.remove("cheese");
        System.out.println(a1);
        a1.retainAll(List.of("butter","yogurt", "eggs"));
        System.out.println(a1);
        a1.clear();
        System.out.println(a1);
        a1.addAll(List.of("milk", "butter", "cheese"));
        a1.addAll(Arrays.asList("banana","yogurt", "eggs"));
        System.out.println(a1);
        a1.sort(Comparator.naturalOrder());
        System.out.println(a1);
        a1.sort(Comparator.reverseOrder());
        System.out.println(a1);



    }
}
