package tech.ajlanza.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;
    private HandStatus status;

    public List<Card> getCards(){
        return cards;
    }

    public enum HandStatus {
        OPEN, STAND, BUST
    }



    public Hand(){
        this.cards = new ArrayList<>();
        setStatus(HandStatus.OPEN);
    }

    public void addCard(Card card){
        this.getCards().add(card);
        if (getValue() > 21) {
            setStatus(HandStatus.BUST);
        }
    }

    public int getValue(){
        int total = 0;
        for(Card card: this.getCards()){
            total = total + card.getValue();
        }
        return total;
    }

    public void setStatus(HandStatus status) {
        this.status = status;
    }

    public HandStatus getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (Card c: this.getCards()) {
            sb.append(String.format("%s, ", c));
        }
        if (this.getCards().size() > 0) {
            sb.deleteCharAt(sb.length() - 2);
        }
        sb.append("]");

        return String.format("Value=%d, %s", this.getValue(), sb.toString());
    }
}
