package tech.ajlanza.blackjack;

public class Main {
    public static void main(String[] args) {
        // No argument constructor
        Card fourteenOfFlamingos = new Card();
        System.out.printf("Card: %s of %s, value of %s and turned up: %b\n", fourteenOfFlamingos.cardFace, fourteenOfFlamingos.suit, fourteenOfFlamingos.value, fourteenOfFlamingos.turnedUp);
        // Two argument constructor
        Card sevenSpades = new Card("7", "Spades");
        Card jackClubs = new Card("Jack", "Clubs");
        System.out.printf("Card: %s of %s, value of %s and turned up: %b\n", sevenSpades.cardFace, sevenSpades.suit, sevenSpades.value, sevenSpades.turnedUp);
        System.out.printf("Card: %s of %s, value of %s and turned up: %b\n", jackClubs.cardFace, jackClubs.suit, jackClubs.value, jackClubs.turnedUp);
        // Four argument constructor
        Card aceOfSpades =  new Card("Ace", "Spades", 1, true);
        Card threeOfDiamonds =  new Card("Three", "Diamonds", 3, false);
        System.out.printf("Card: %s of %s, value of %s and turned up: %b\n", aceOfSpades.cardFace, aceOfSpades.suit, aceOfSpades.value, aceOfSpades.turnedUp);
        System.out.printf("Card: %s of %s, value of %s and turned up: %b\n", threeOfDiamonds.cardFace, threeOfDiamonds.suit, threeOfDiamonds.value, threeOfDiamonds.turnedUp);
    }
}
