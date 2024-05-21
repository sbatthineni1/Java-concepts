package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        String[] names = { "Ann", "Bob", "Carol", "David"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("Gary", "George", "Grace"));
        System.out.println(list);
        System.out.println("Is Gary in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Is Gary in the list? " + list.contains("Gary"));
       // list.forEach( s-> System.out.println(s));
        list.forEach(System.out::println);
       // list.sort();

    }
}
