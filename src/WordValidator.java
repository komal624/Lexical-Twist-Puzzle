public class WordValidator {

    public boolean isSingleWord(String word) {
        return !word.contains(" ");
    }
}