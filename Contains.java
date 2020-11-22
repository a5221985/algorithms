import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Contains {
    public static void main(String[] args) {
        Contains contains = new Contains();
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "ball", "cat", "dog", "elephant", "fox", "goat"));
        System.out.println(strings.contains("cat"));

        List<List<String>> stringsList = new ArrayList<>(Arrays.asList(strings));
        List<String> strings1 = new ArrayList<>(Arrays.asList("apple", "ball", "cat", "dog", "elephant", "fox", "goat"));
        System.out.println(stringsList.contains(strings1));
    }
}
