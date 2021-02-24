import java.util.stream.Stream;
import java.util.Iterator;

public class StreamsIterator {
    public static void main(String[] args) {
        Stream<String> streamOfNames = Stream.of("Ape", "Baboon", "Cat", "Dog", "Elephant", "Fox", "Goat");

        for (Iterator<String> iterator = streamOfNames.iterator(); iterator.hasNext();)
            System.out.println(iterator.next());
    }
}
