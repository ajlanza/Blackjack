package tech.ajlanza.blackjack;

public class Card {
    String suit;
    String cardFace;
    int value;
    boolean turnedUp;

    public Card() {
        this("Three", "Spades", 1, false);
    }
    public Card(String cardFace, String suit) {
        this(cardFace, suit, 1, false);
    }

    public Card(String cardFace, String suit, int value, boolean turnedUp) {
        this.suit = suit;
        this.cardFace = cardFace;
        this.value = value;
        this.turnedUp = turnedUp;
    }

    @Override
    public String toString() {
        return String.format("Card: %s of %s (Value: %d, Turned Up: %b)", this.cardFace, this.suit, this.value, this.turnedUp);
    }
}
