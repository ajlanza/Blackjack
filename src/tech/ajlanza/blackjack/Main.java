package tech.ajlanza.blackjack;

public class Main {
    public static void main(String[] args) {
        // No argument constructor
        Card defaultCard = new Card();
        System.out.println(defaultCard);
        // Two argument constructor
        Card sevenSpades = new Card("7", "Spades");
        Card jackClubs = new Card("Jack", "Clubs");
        System.out.println(sevenSpades);
        System.out.println(jackClubs);
        // Four argument constructor
        Card aceOfSpades =  new Card("Ace", "Spades", 1, true);
        Card threeOfDiamonds =  new Card("Three", "Diamonds", 3, false);
        System.out.println(aceOfSpades);
        System.out.println(threeOfDiamonds);
    }
}
