package dev.lpa;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
                //System.out.println("" +c + i);

            }
            start += 15;
        }
        Collections.shuffle(bingoPool);
        for (int i = 0; i < 15; i++) {
            System.out.printf("%s ", bingoPool.get(i));
        }

        System.out.println("\n----------------------------------");

        // List<String> firstOnes = bingoPool.subList(0,15);
        List<String> firstOnes = new ArrayList<>(bingoPool.subList(0, 15));
        firstOnes.sort(Comparator.naturalOrder());
        firstOnes.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf("O") == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }
            return s;
        });
        System.out.println("\n-----------------------------------");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%s ", bingoPool.get(i));
        }

        System.out.println("\n----------------------------------");

        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf("G") == 0 || s.indexOf("O") == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println("\n----------------------------------");

        String[] strings = {"One", "Two", "Three"};
        var firstStream = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());

//        firstStream.forEach(System.out::println);

        var secondStream = Stream.of("Six", "Seven", "Eight")
                .map(String::toUpperCase);

        //secondStream.forEach(System.out::println);
        Stream.concat(secondStream, firstStream)
                .map(s -> s.charAt(0) + "-" + s)
                .forEach(System.out::println);
        System.out.println("\n----------------------------------");

        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for (char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            //System.out.println(Arrays.toString(numbers));
            int labelNo = bingoIndex;
            Arrays.setAll(numbers, i -> i + labelNo);
            System.out.println(Arrays.toString(numbers));
            myMap.put(c, numbers);
            bingoIndex += 15;

        }

        myMap.entrySet()
                .stream()
                .map(e -> e.getKey() + " has range " + e.getValue()[0] + " - " + e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);
        System.out.println("\n----------------------------------");

        Random random = new Random();
        Stream<Integer> randomList = Stream.generate(() -> random.nextInt(2))
                .limit(10);

        randomList.forEach(x -> System.out.print(x + " "));
        System.out.println("\n----------------------------------");

        IntStream.iterate(1, n -> n + 1)
                .filter(Main::isPrime)
                .limit(20)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n----------------------------------");

        IntStream.iterate(1, n -> n + 1)
                .limit(100)
                .filter(Main::isPrime)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n----------------------------------");

        IntStream.iterate(1, n -> n <= 100, n -> n + 1)
                .filter(Main::isPrime)
                .forEach(x -> System.out.print(x + " "));
        System.out.println("\n----------------------------------");
        IntStream.rangeClosed(1, 100)
                .filter(Main::isPrime)
                .forEach(x -> System.out.print(x + " "));


    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0)
                return false;
        }
        return true;
    }
}
