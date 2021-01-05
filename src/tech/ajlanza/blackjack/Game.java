package tech.ajlanza.blackjack;

public class Game {
    private Hand player;
    private Hand dealer;
    private Deck deck;


    public enum Action {
        HIT, STAND
    }

    public Hand getPlayer() {
        return player;
    }

    public void setPlayer(Hand player) {
        this.player = player;
    }

    public Hand getDealer() {
        return dealer;
    }

    public void setDealer(Hand dealer) {
        this.dealer = dealer;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Game() {
        setPlayer(new Hand());
        setDealer(new Hand());
        setDeck(new Deck());
        getDeck().shuffle();
        getPlayer().addCard(getDeck().deal());
        getDealer().addCard(getDeck().deal());
        getPlayer().addCard(getDeck().deal());
        getDealer().addCard(getDeck().deal());
    }

    @Override
    public String toString() {
        return String.format("Player: %s, Dealer %s", getPlayer(), getDealer());
    }

    public void playerMove(Action action) {
        if(action == Action.HIT){
            getPlayer().addCard(getDeck().deal());
        } else {
            if(action == Action.STAND) {
                getPlayer().setStatus(Hand.HandStatus.STAND);
            }
        }
    }

    public void dealerMove() {
        while(getDealer().getValue() < 16 && getDealer().getStatus() == Hand.HandStatus.OPEN) {
            getDealer().addCard(getDeck().deal());
        }
        if(getDealer().getStatus() == Hand.HandStatus.OPEN) {
            getDealer().setStatus(Hand.HandStatus.STAND);
        }
    }

    public boolean isPlayerTurn() {
        return getPlayer().getStatus() == Hand.HandStatus.OPEN;
    }

    public String outcome() {
        if(getPlayer().getStatus() == Hand.HandStatus.BUST && getDealer().getStatus() == Hand.HandStatus.BUST){
            return "Everyone BUSTED! No winner!";
        }
        if(getPlayer().getStatus() == Hand.HandStatus.BUST && getDealer().getStatus() == Hand.HandStatus.STAND) {
            return "You BUST! Dealer wins!";
        }
        if(getPlayer().getStatus() == Hand.HandStatus.STAND && getDealer().getStatus() == Hand.HandStatus.BUST) {
            return "Dealer BUST! You win!";
        }
        if(getPlayer().getValue() > getDealer().getValue()) {
            return "You win!";
        }
        return "You lose. Dealer wins.";
    }
}
