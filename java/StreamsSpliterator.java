import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class StreamsSpliterator {
    public static void main(String[] args) {
        Stream<String> streamOfNames = Stream.of("Anaconda", "Baboon", "Cat", "Deer", "Elephant", "Frog", "Goat", "Horse", "Iguana", "Jackal", "Kangaroo", "Lion", "Monkey", "Nilgai", "Owl", "Parrot", "Quail", "Rabbit", "Sea Horse", "Tiger", "Urchin", "Vulture", "Wolf", "X-Ray Fish", "Yak", "Zebra");

        Spliterator<String> spliterator = streamOfNames.spliterator();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println();
        
        List<String> listOfNames = Arrays.asList("Anaconda", "Baboon", "Cat", "Deer", "Elephant", "Frog", "Goat", "Horse", "Iguana", "Jackal", "Kangaroo", "Lion", "Monkey", "Nilgai", "Owl", "Parrot", "Quail", "Rabbit", "Sea Horse", "Tiger", "Urchin", "Vulture", "Wolf", "X-Ray Fish", "Yak", "Zebra");
        listOfNames.stream().spliterator().forEachRemaining(System.out::println);

        Stream<String> streamOfNames2 = listOfNames.stream();
        Spliterator<String> spliterator1 = streamOfNames2.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println();
        if (spliterator2 != null)
            spliterator2.forEachRemaining(System.out::println);
        System.out.println();
        spliterator1.forEachRemaining(System.out::println);
    }
}
