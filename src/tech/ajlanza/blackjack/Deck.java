package tech.ajlanza.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {

//    public static final int DECK_SIZE = 52;
//    private Card[] cards;
    private List<Card> cards;

    public Deck() {
//        this.setCards( new Card[DECK_SIZE] );
        this.setCards( new ArrayList<>());
        int i = 0;
        for(Suit suit: Suit.values()){
            for(Face face: Face.values()){
//                this.getCards()[i] = new Card(face, suit);
                this.getCards().add(new Card(face, suit));
                i++;
            }
        }
    }

    public List<Card> getCards(){
        return cards;
    }

    public void setCards(List<Card> cards){
        this.cards = cards;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Card c : this.getCards()){
            sb.append(String.format("%s,", c));
        }
//        if (this.getCards().length > 0) {
        if (this.getCards().size() > 0){
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
