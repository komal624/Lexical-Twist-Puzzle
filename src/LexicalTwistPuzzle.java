import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        // UC1
        System.out.println("Lexical Twist Puzzle");

        // UC2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        // UC3
        if (word1.contains(" ")) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        if (word2.contains(" ")) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        // UC4
        String reversed = new StringBuilder(word1).reverse().toString();

        if (reversed.equalsIgnoreCase(word2)) {

            // UC5
            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            // UC6 - Combine & Count
            String combined = (word1 + word2).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char ch : combined.toCharArray()) {

                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            System.out.println("Combined Word: " + combined);
            System.out.println("Vowel Count: " + vowels);
            System.out.println("Consonant Count: " + consonants);
        }
    }
}