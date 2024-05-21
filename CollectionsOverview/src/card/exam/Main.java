package card.exam;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card AceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        // Arrays fill method vs Collections fill method
        Arrays.fill(cardArray, AceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts", 1);
        //output:Ace of Hearts
        //A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, AceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());
        Card.printDeck(cards, "Aces of Hearts", 1);
        //output: []
        //cards.size() = 0
        //------------------------
        //Aces of Hearts

        List<Card> acesOfHearts = Collections.nCopies(13, AceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);
        //output: Aces of Hearts
        //A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12) A♥(12)
        //------------------------

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);
        //------------------------
        //Kings of Clubs
        //K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11) K♣(11)

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Acses of Hearts added", 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection added with kings Copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List copy of kings", 1);
        //This creates a immutable list when used List.copyof cant add any elements later
        // Collections.addAll(cards, cardArray);
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);
        Collections.reverse(deck);
        Card.printDeck(deck, "reversed Deck", 4);

        //var sortingAlgorithm = Comparator.comparing((Card card) -> card.rank()).thenComparing(card -> card.suit());
        var sortingAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank and suit", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck sorted by rank and suit", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "List of Kings", 1);
        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "List of tens", 1);
        //List of tens
        //10♠(8) 10♥(8) 10♦(8) 10♣(8)
        var subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("index of tens: " + subListIndex);
        //index of tens: 16
        System.out.println("Contains tens: " + deck.containsAll(tens));
        //Contains tens: true
        var disJoint = Collections.disjoint(deck, kings);
        System.out.println("Disjoint? " + disJoint);
        //Disjoint? false
        var disJoint2 = Collections.disjoint(tens, kings);
        System.out.println("Disjoint kings in tens list? " + disJoint2);
        //Disjoint kings in tens list? true

        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank and suit", 13);
        Card tenOHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        System.out.println("Foundindex " + deck.indexOf(tenOHearts));
        var foundIndex = Collections.binarySearch(deck, tenOHearts, sortingAlgorithm);
        System.out.println("Foundindex " + foundIndex);
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOHearts, tenOfClubs);
        Card.printDeck(deck.subList(32, 36), "replaced", 1);

        Collections.replaceAll(deck, tenOfClubs, tenOHearts);
        Card.printDeck(deck.subList(32, 36), "replaced", 1);
        if (Collections.replaceAll(deck, tenOfClubs, tenOHearts)) {
            System.out.println("tens of Clubs replaced");
        }
        System.out.println("Nothing replaced");
        System.out.println(Collections.frequency(deck, tenOHearts));

        Card.printDeck(deck);

        System.out.println("Best Card " + Collections.max(deck, sortingAlgorithm));
        System.out.println("WorstCard " + Collections.min(deck, sortingAlgorithm));
        //var sortBySuit = Comparator.comparing((Card card) -> card.suit()).thenComparing(card -> card.rank());
        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by suit, rank", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("Unrotated " + deck.subList(0, 13));
        System.out.println("Rotated " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Unrotated " + deck.subList(0, 13));
        System.out.println("Rotated " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        System.out.println("original " + deck.subList(0, 13));
        for (int i = 0; i < copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size() - 1 - i);
           // System.out.println("iteration: " +copied);

        }
        System.out.println("Manual Reverse " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using Reverse " + copied);
    }
}
