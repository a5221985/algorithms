import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesUsingLibrary {
    public static void main(String[] args) {
        String str = "aaaabbcccdddddddefgghijjjkllmnoooopqrrssssssttuvwxxyyyyz";
        List<Character> list = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Set<Character> set = new LinkedHashSet<>(list);
        String unique = set.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(""));
        System.out.println(unique);
    }
}
