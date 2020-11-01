import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ReverseStringsKeepingDelimiters {
    public String reverse(String input, Set<Character> delimiters) {
        if (input == null || input.length() == 0)
            return "";
        Deque<String> deque = new LinkedList<>();
        int startIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (delimiters.contains(input.charAt(i))) {
                if (i > startIndex)
                    deque.addLast(input.substring(startIndex, i));
                deque.addLast("" + input.charAt(i));
                startIndex = i + 1;
            }
        }
        if (startIndex <= input.length())
            deque.addLast(input.substring(startIndex));

        StringBuilder sb = new StringBuilder();
        Iterator<String> reverseIterator = deque.descendingIterator();
        for (Iterator<String> iterator = deque.iterator(); iterator.hasNext();) {
            String item = iterator.next();
            if (delimiters.contains(item.charAt(0))) {
                sb.append(item);
            } else {
                while (reverseIterator.hasNext()) {
                    String item2 = reverseIterator.next();
                    if (!delimiters.contains(item2.charAt(0))) {
                        sb.append(item2);
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello/world:here";
        Set<Character> delimiters = new HashSet<>(Arrays.asList('/', ':'));
        ReverseStringsKeepingDelimiters rskd = new ReverseStringsKeepingDelimiters();
        System.out.println(rskd.reverse(input, delimiters));
    }
}
