package lists.ll;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String town, int Distance) {
    @Override
    public String toString() {
        return town + " " + Distance;
    }
}

public class LinkedListPractise {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();
        addElements(places);
        System.out.println(places);

        printOptions();
        boolean flag = true;
        while (flag) {
            switch (scanner.nextLine()) {
                case "F" -> IterateForward(places);
                case "B" -> IterateBackword(places);
                case "L" -> System.out.println(places);
                case "M" -> printOptions();
                default -> flag = false;
            }
        }

    }

    private static void IterateForward(LinkedList<Place> places) {
        Iterator<Place> iterator = places.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void IterateBackword(LinkedList<Place> places) {
        ListIterator<Place> iterator = places.listIterator(6);
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    private static void addElements(LinkedList<Place> places) {
        places.add(new Place("Alice Springs", 2771));
        places.addLast(new Place("Brisbane", 917));
        places.offer(new Place("Darwin", 3972));
        places.offerLast(new Place("Melbourne", 877));
        places.addFirst(new Place("Adelaide", 1374));
        places.addLast(new Place("Perth", 3923));


    }

    private static void printOptions() {
        String textBlock = """
                Available actions:
                (F)orward
                (B)ackword
                (L)ist Places
                (M)enu
                (Q)uit            
                """;
        System.out.println(textBlock);
    }
}
