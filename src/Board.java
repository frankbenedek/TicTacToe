public class Board {
    private static Game game = new Game();
    public static char[][] grid = new char[3][3];
    public static void makeGrid() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '-';
            }
        }
        showGrid(grid);
    }
    public static void makeGrid(int choice, char player) {
        System.out.println("Player: " + player);
        choice = choice - 1;
        int row = choice / 3;
        int col = choice % 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    grid[i][j] = '-';
                }
            }
        }
        if (grid[row][col] == '-') {
            grid[row][col] = player;
        }else{
            System.out.println("Wrong spot!");
            game.makeChoice(player);
        }
        showGrid(grid);
    }

    public static void showGrid(char[][] grid) {
        System.out.println("Current state");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n----------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + grid[i][j] + "\t| ");
            }
        }
        System.out.println("\n----------------------------");
    }
}
