import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // UC1 - Display Puzzle Title
        System.out.println("Lexical Twist Puzzle");

        // UC2 - Accept Word Inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // UC3 - Validate Single Word Constraint
        if (word1.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (word2.contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        // UC4 - Check Reverse Relationship (case-insensitive)
        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {
            System.out.println("The second word is the reverse of the first word.");
        } else {
            System.out.println("The words are not reverse of each other.");
        }
    }
}