public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // Initialize board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Example move
        placeMove(0, 0, 'X');

        // Print board
        printBoard();
    }

    // UC6: Place Move on Board
    static void placeMove(int row, int col, char symbol) {

        // Check if position is valid
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid position!");
            return;
        }

        // Check if cell is already filled
        if (board[row][col] != '-') {
            System.out.println("Cell already occupied!");
            return;
        }

        // Place the symbol
        board[row][col] = symbol;
    }

    // Helper method to print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}