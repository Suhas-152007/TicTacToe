import java.util.Scanner;

public class TicTacToe {

    // Entry point of the program
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1–9)
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();   // Read integer input

        return slot;               // Return the entered value
    }
}