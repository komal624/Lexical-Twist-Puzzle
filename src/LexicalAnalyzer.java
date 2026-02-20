import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalAnalyzer {

    public boolean isReverse(String word1, String word2) {
        String reversed = new StringBuilder(word1).reverse().toString();
        return reversed.equalsIgnoreCase(word2);
    }

    public String transformWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.toLowerCase().replaceAll("[aeiou]", "@");
    }

    public String processNonReverse(String word1, String word2) {

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

        if (vowels > consonants) {
            return getUniqueCharacters(combined, true);
        } else if (consonants > vowels) {
            return getUniqueCharacters(combined, false);
        } else {
            return "Vowels and consonants are equal";
        }
    }

    private String getUniqueCharacters(String text, boolean vowelsOnly) {

        Set<Character> unique = new LinkedHashSet<>();

        for (char ch : text.toCharArray()) {

            if (vowelsOnly && "AEIOU".indexOf(ch) != -1) {
                unique.add(ch);
            } else if (!vowelsOnly &&
                    Character.isLetter(ch) &&
                    "AEIOU".indexOf(ch) == -1) {
                unique.add(ch);
            }

            if (unique.size() == 2)
                break;
        }

        StringBuilder result = new StringBuilder();
        for (char ch : unique) {
            result.append(ch);
        }

        return result.toString();
    }
}