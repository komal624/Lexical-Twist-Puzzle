import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

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

            // UC6
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

            // UC7 - Rule-Based Output

            if (vowels > consonants) {

                Set<Character> uniqueVowels = new LinkedHashSet<>();

                for (char ch : combined.toCharArray()) {
                    if ("AEIOU".indexOf(ch) != -1) {
                        uniqueVowels.add(ch);
                    }
                    if (uniqueVowels.size() == 2)
                        break;
                }

                for (char ch : uniqueVowels) {
                    System.out.print(ch);
                }

            } else if (consonants > vowels) {

                Set<Character> uniqueConsonants = new LinkedHashSet<>();

                for (char ch : combined.toCharArray()) {
                    if (Character.isLetter(ch) && "AEIOU".indexOf(ch) == -1) {
                        uniqueConsonants.add(ch);
                    }
                    if (uniqueConsonants.size() == 2)
                        break;
                }

                for (char ch : uniqueConsonants) {
                    System.out.print(ch);
                }

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}