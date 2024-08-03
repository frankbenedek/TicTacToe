import java.util.Scanner;

public class Main {
    private static Game game = new Game();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showMenu();
            switch (sc.next()) {
                case "1":
                    game.startGame();
                case "5":
                    System.out.println("Exiting...");
                    exit = true;
            }
        }
    }

    public static void showMenu() {
        System.out.println("\t\t----------------------");
        System.out.println("\t\t|Welcome to TicTacToe|");
        System.out.println("\t\t----------------------");
        System.out.println("\t\t1. Start game");
        System.out.println("\t\t5. Exit");
    }
}