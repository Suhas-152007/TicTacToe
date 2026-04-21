// TicTacToe
// UC5: Validates whether a move is inside the board boundaries
// and whether the selected cell is empty.

public class TicTacToe {

    // 3x3 board initialization with empty cells '-'
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // Entry point of the program
    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        // Test the validation method
        boolean result = isValidMove(row, col);

        System.out.println("Is move valid? " + result);
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: row, column
     * Output: true if valid, false otherwise
     */
    static boolean isValidMove(int row, int col) {

        // Boundary check (0 to 2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}