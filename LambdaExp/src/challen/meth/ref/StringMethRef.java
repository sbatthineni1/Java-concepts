package challen.meth.ref;

import java.util.*;
import java.util.function.UnaryOperator;

public class StringMethRef {
    private static Random random = new Random();

    private record Person(String first) {
        public String last(String s) {
            return first + " " + s.substring(0, s.indexOf(" "));
        }

    }

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Charlie", "David", "Eva", "Francis"};
        Person tim = new Person("Tim");
        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
                //s -> s.toUpperCase();
                String::toUpperCase,
                s -> s + " " + getRandomChar('A', 'G') + ".",
                s1 -> s1 + " " + reverse(s1, 0, s1.indexOf(" ")),
                StringMethRef::reverse,
                //s -> new String(s)
                String::new,
                //s-> new String ("Howdy" +s),
                String::valueOf,
                // obj -> String.valueOf(Arrays.toString(names))
                // s -> tim.last(s)
                tim::last,
                //s2 -> (new Person("Mary")).last(s2)
                (new Person("Mary"))::last

        ));
        applyChanges(names, list);

    }


    private static void applyChanges(String[] names, List<UnaryOperator<String>> stringFunction) {
        List<String> backedArray = Arrays.asList(names);
        for (var function : stringFunction) {
            backedArray.replaceAll(s -> s.transform(function));
            System.out.println(backedArray);
        }
    }

    private static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String reverse(String s) {
        return reverse(s, 0, s.length());
    }

    private static String reverse(String s, int start, int end) {
        return new StringBuilder(s.substring(start, end)).reverse().toString();
    }


}
