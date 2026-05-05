import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char human = 'X';
    static char computer = 'O';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.println("Your Turn (Enter row and col 0-2): ");
                int row = sc.nextInt();
                int col = sc.nextInt();

                if (board[row][col] == '-') {
                    placeMove(row, col, human);
                    isHumanTurn = false;
                } else {
                    System.out.println("Invalid move! Try again.");
                    continue;
                }

            } else {
                System.out.println("Computer Turn...");
                computerMove();
                isHumanTurn = true;
            }

            // Check game status
            if (checkWin(human)) {
                printBoard();
                System.out.println("You Win!");
                gameOver = true;
            } 
            else if (checkWin(computer)) {
                printBoard();
                System.out.println("Computer Wins!");
                gameOver = true;
            } 
            else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a Draw!");
                gameOver = true;
            }
        }

        sc.close();
    }

    
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7
    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                placeMove(row, col, computer);
                break;
            }
        }
    }

    
    static boolean checkWin(char symbol) {

        // Rows & Columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            return true;
        }

        return false;
    }

    
    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    
    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}