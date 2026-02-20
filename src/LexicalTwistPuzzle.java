import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // UC3 - Validate single word constraint
        if (word1.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (word2.contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        // Program continues only if valid
    }
}