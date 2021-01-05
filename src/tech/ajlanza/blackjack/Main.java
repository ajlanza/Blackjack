package tech.ajlanza.blackjack;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("The initial Game");
        System.out.println(game);

        System.out.println("The player's turn");
        while(game.isPlayerTurn()) {
            if(game.getPlayer().getValue() < 18) {
                System.out.println("Hit");
                game.playerMove(Game.Action.HIT);
            } else {
                System.out.println("STAND");
                game.playerMove(Game.Action.STAND);
            }
            System.out.println(game.getPlayer());
        }

        System.out.println("The dealer's Turn");
        game.dealerMove();

        System.out.println(game.outcome());
        System.out.println(game);
    }
}
