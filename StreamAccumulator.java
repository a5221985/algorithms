import java.util.List;
import java.util.Arrays;

public class StreamAccumulator {
    public String accumulate(List<String> words) {
        if (words == null || words.isEmpty())
            return "";
        return words.stream().reduce("", (partialString, element) -> partialString + element);
    }

    public static void main(String[] args) {
        StreamAccumulator sa = new StreamAccumulator();
        List<String> words = Arrays.asList("ape", "baboon", "cat", "dog", "elephant", "falcon", "goat", "hare", "i", "jackle", "kangaroo", "lion", "monkey", "n", "owl", "parrot", "q", "rabbit", "squirrel", "tiger", "u", "vulture", "w", "x", "yak", "zebra");

        System.out.println(sa.accumulate(words));
    }
}
