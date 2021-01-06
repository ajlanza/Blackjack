package tech.ajlanza.blackjack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.play();
    }

    public void play() {
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);
        while(keepPlaying) {
            String menuChoice = getMenuChoice(scanner);
            keepPlaying = menuChoice.equalsIgnoreCase("s");
            if(keepPlaying) {
                System.out.println("This is one game play here");
                doGame(scanner);
            }
        }
        System.out.println("Thanks for playing!");
    }

    public String getMenuChoice(Scanner scanner) {
        String menuChoice = " ";
        boolean isValid = false;
        while(!isValid) {
            System.out.println("Welcome to Blackjack!\n\n Press s to start or e to exit");
            menuChoice = scanner.next();
            isValid = menuChoice.equalsIgnoreCase("s") || menuChoice.equalsIgnoreCase("e");
            if(!isValid) {
                System.out.println("Invalid choice!");
            }
        }
        return menuChoice;
    }

    public Game.Action getPlayerChoice(Scanner scanner) {
        boolean isValid = false;
        String input = "";
        while(!isValid){
            System.out.println("What do you want to do? Hit (h) or Stand (s)?");
            input = scanner.next();
            isValid = input.equalsIgnoreCase("h") || input.equalsIgnoreCase("s");
            if(!isValid) {
                System.out.println("Invalid choice. h for Hit and s for Stand");
            }
        }
        return Game.Action.valueOf(input.equalsIgnoreCase("h") ? "HIT" : "STAND");
    }

    public void doGame(Scanner scanner) {
        Game game = new Game();
        System.out.println("The initial game:");
        System.out.println(game);

        System.out.println("Your turn");
        while(game.isPlayerTurn()) {
            System.out.printf("Your hand: %s\n", game.getPlayer());
            Game.Action action = getPlayerChoice(scanner);
            System.out.println(action);
            game.playerMove(action);
        }

        System.out.println(game.outcome());
        System.out.println(game);
    }
}
