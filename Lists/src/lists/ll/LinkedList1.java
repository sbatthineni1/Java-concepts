package lists.ll;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        //LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addElements(placesToVisit);
        System.out.println(placesToVisit);
        printItinerary(placesToVisit);
        System.out.println(placesToVisit);
    }
    private static void addElements(LinkedList<String> list){
        list.add("Brisbane");
        list.addFirst("Darwin");
        list.addLast("melbourne");
        //Stack methods
        list.push("Toowoomba");
        //Queue methods
        list.offer("AlieSprings"); // adds last element
        list.offerLast("north Springs"); // adds last element
        list.offerFirst("sandy Springs"); // adds first element
/*
        //Queue remove methods
        list.poll(); //remove first element
        list.pollFirst();
        list.pollLast();

 */
    }
    private static void printItinerary(LinkedList<String> list){

        ListIterator<String> iterator = list.listIterator(1);
        String previousTown= list.getFirst();
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> from "+ previousTown + " to " + town);
            previousTown =  town;
        }
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}
