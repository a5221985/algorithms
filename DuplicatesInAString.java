import java.util.List;
import java.util.LinkedList;

public class DuplicatesInAString {
    public List<Character> findDuplicates(String str) {
        int[] frequency = new int [26];
        for (int i = 0; i < str.length(); i++)
            frequency[str.charAt(i) - 'a']++;
        List<Character> duplicates = new LinkedList<>();
        for (int i = 0; i < frequency.length; i++)
            if (frequency[i] > 1)
               duplicates.add((char) (i + 'a'));
        return duplicates;
    }

    public static void main(String[] args) {
        DuplicatesInAString dias = new DuplicatesInAString();
        String str = "babacccdefghidfjkki";
        List<Character> duplicates = dias.findDuplicates(str);
        System.out.println("String: " + str);
        System.out.println("Duplicates: " + duplicates);
    }
}
