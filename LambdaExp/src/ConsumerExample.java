import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Alpha", "Beta", "Charlie", "Delta"));

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------");
        list.forEach((var myString) -> System.out.println(myString));
        System.out.println("--------------");
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(first + " -> " + myString + prefix);
        });
        //prefix = "NATO";

        list.removeIf(s -> s.equalsIgnoreCase("beta"));
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        list.add(1, "bravo");
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach(s -> System.out.println(s));
        System.out.println("--------------");
        list.removeIf(s-> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("--------------");
        list.forEach(s-> System.out.println(s));
        System.out.println("--------------");
        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));
        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings));
    }
}
