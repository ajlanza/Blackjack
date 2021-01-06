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
}
