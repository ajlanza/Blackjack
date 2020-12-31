package tech.ajlanza.blackjack;

public class Card {
    private String suit;
    private String cardFace;
    private int value;
    private boolean turnedUp;

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

    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String getCardFace(){
        return cardFace;
    }

    public void setCardFace(String cardFace){
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
