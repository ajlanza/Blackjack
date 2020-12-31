package tech.ajlanza.blackjack;

public class Card {
    private Suit suit;
    private Face cardFace;
    private int value;
    private boolean turnedUp;

    public Card() {
        this(Face.THREE, Suit.SPADES, 1, false);
    }
    public Card(Face cardFace, Suit suit) {
        this(cardFace, suit, 1, false);
    }

    public Card(Face cardFace, Suit suit, int value, boolean turnedUp) {
        this.suit = suit;
        this.cardFace = cardFace;
        this.value = value;
        this.turnedUp = turnedUp;
    }

    @Override
    public String toString() {
        return String.format("Card: %s of %s (Value: %d, Turned Up: %b)", this.cardFace, this.suit, this.value, this.turnedUp);
    }

    public Suit getSuit(){
        return suit;
    }

    public void setSuit(Suit suit){
        this.suit = suit;
    }

    public Face getCardFace(){
        return cardFace;
    }

    public void setCardFace(Face cardFace){
        this.cardFace = cardFace;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public boolean isTurnedUp(){
        return turnedUp;
    }

    public void setTurnedUp(boolean turnedUp){
        this.turnedUp = turnedUp;
    }
}
