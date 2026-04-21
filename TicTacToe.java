import java.util.Random;

public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }

    // Method to perform toss and assign symbols
    static void tossAndAssignSymbols() {
        Random random = new Random();

        // Generate random number (0 or 1)
        int toss = random.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Method to display result
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("Human won the toss!");
            System.out.println("Human plays first.");
        } else {
            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}