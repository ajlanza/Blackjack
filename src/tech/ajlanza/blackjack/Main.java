package tech.ajlanza.blackjack;

public class Main {
    public static void main(String[] args) {
        // No argument constructor
        Card defaultCard = new Card();
        System.out.println(defaultCard);
        // Two argument constructor
        Card sevenSpades = new Card(Face.SEVEN, Suit.SPADES);
        Card jackClubs = new Card(Face.JACK, Suit.CLUBS);
        System.out.println(sevenSpades);
        System.out.println(jackClubs);
        // Four argument constructor
        Card aceOfSpades =  new Card(Face.ACE, Suit.SPADES, 1, true);
        Card threeOfDiamonds =  new Card(Face.THREE, Suit.DIAMONDS, 3, false);
        System.out.println(aceOfSpades);
        System.out.println(sevenSpades.getCardFace());
        sevenSpades.setSuit(Suit.DIAMONDS);
        System.out.println(sevenSpades);
    }
}
