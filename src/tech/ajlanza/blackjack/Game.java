package tech.ajlanza.blackjack;

public class Game {
    private Hand player;
    private Hand dealer;
    private Deck deck;

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
        return String.format("Player: %s, Dealer: %s", getPlayer(), getDealer());
    }

    public void playerMove(Action action) {
        if(action == Action.HIT){
            getPlayer().addCard(getDeck().deal());
        } else {
            if(action == Action.STAND) {
                getPlayer().setStatus(HandStatus.STAND);
            }
        }
    }

    public void dealerMove() {
        while(getDealer().getValue() < 16 && getDealer().getStatus() == HandStatus.OPEN) {
            getDealer().addCard(getDeck().deal());
        }
        if(getDealer().getStatus() == HandStatus.OPEN) {
            getDealer().setStatus(HandStatus.STAND);
        }
    }

    public boolean isPlayerTurn() {
        return getPlayer().getStatus() == HandStatus.OPEN;
    }

    public String outcome() {
        if(getPlayer().getStatus() == HandStatus.BUST && getDealer().getStatus() == HandStatus.BUST){
            return "Everyone BUSTED! No winner!";
        }
        if(getPlayer().getStatus() == HandStatus.BUST && getDealer().getStatus() == HandStatus.STAND) {
            return "You BUST! Dealer wins!";
        }
        if(getPlayer().getStatus() == HandStatus.STAND && getDealer().getStatus() == HandStatus.BUST) {
            return "Dealer BUST! You win!";
        }
        if(getPlayer().getValue() > getDealer().getValue()) {
            return "You win!";
        }
        return "You lose. Dealer wins.";
    }
}
