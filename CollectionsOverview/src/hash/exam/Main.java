package hash.exam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PlayingCard aceOfHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingOfClubs = new PlayingCard("Club", "King");
        PlayingCard queenOfSpades = new PlayingCard("Spades", "Queen");
        List<PlayingCard> cards = Arrays.asList(aceOfHearts, kingOfClubs, queenOfSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));
        Set<PlayingCard> deck = new HashSet<>();
        for(PlayingCard c: cards){
            if(!deck.add(c)){
                System.out.println("Found a duplicate for "+c);
            }
        }
        System.out.println(deck);
    }
}
