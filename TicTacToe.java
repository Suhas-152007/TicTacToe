import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    // UC6 reused here
    static void placeMove(int row, int col, char symbol) {
        if (board[row][col] == '-') {
            board[row][col] = symbol;
        }
    }

    // UC7: Computer makes random move
    static void computerMove() {

        Random rand = new Random();
        int row, col;

        // Loop until valid move found
        while (true) {

            int slot = rand.nextInt(9) + 1; // 1 to 9

            // Convert slot → row & col
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if empty
            if (board[row][col] == '-') {
                placeMove(row, col, computerSymbol);
                System.out.println("Computer placed at position: " + slot);
                break;
            }
        }
    }

    // Print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}