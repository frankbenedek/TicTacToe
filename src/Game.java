import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Board board = new Board();
    public static void startGame() {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        System.out.println("The starter player is chosen randomly.");
        int starter =  choseStarter();
        char starterPlayer;
        if (starter == 1) {
            starterPlayer = 'X';
        } else {
            starterPlayer = 'O';
        }
        System.out.println("The starter player is " + starterPlayer);
        System.out.println("Good Luck! (Pres Enter to start)");
        sc.nextLine();

        while (!exit) {

            board.makeGrid();
            char current = starterPlayer;
            boolean finished = false;
            while(!finished) {
                makeChoice(current);
                if (checkWin()){
                    System.out.println("The winner is: "+ current);
                    finished = true;
                } else{
                    makeChoice(choseNext(current));
                }
            }
            if (finished){
                exit = true;
            }
        }
    }
    public static boolean checkWin(){
        for (int i = 0; i < 6; i++) {
            if (calculateCells(i) != '-' && calculateCells(i) == calculateCells(i+1) && calculateCells(i) == calculateCells(i+2)){
                return true;
            } else if(i < 3){
                if (calculateCells(i) != '-' && calculateCells(i) == calculateCells(i+3) && calculateCells(i) == calculateCells(i+6) ) {
                    return true;
                }
            }
            if (i == 0) {
                if (calculateCells(i) != '-' && calculateCells(i) == calculateCells(i + 4) && calculateCells(i) == calculateCells(i + 8)) {
                    return true;
                }
            }
            if (i == 2){
                if (calculateCells(i) != '-' && calculateCells(i) == calculateCells(i+2) && calculateCells(i) == calculateCells(i+4) ) {
                    return true;
                }
            }
        }
        return false;
    }

    public static char calculateCells(int num){
        int row = num / 3;
        int col = num % 3;
        return board.grid[row][col];
    }

    public static int choseStarter() {
        int choice = new Random().nextInt(2);
        return choice;

    }

    public static char choseNext(char last) {
        if (last == 'X') {
            return 'O';

        } else {
            return 'X';
        }

    }

    public static void makeChoice(char player) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice " + player + ":");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                board.makeGrid(1, player);
                break;
            case 2:
                board.makeGrid(2, player);
                break;
            case 3:
                board.makeGrid(3, player);
                break;
            case 4:
                board.makeGrid(4, player);
                break;
            case 5:
                board.makeGrid(5, player);
                break;
            case 6:
                board.makeGrid(6, player);
                break;
            case 7:
                board.makeGrid(7, player);
                break;
            case 8:
                board.makeGrid(8, player);
                break;
            case 9:
                board.makeGrid(9, player);
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}


