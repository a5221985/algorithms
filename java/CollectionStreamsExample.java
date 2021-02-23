import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Optional;

public class CollectionStreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 2, 1, 9, 5, 9, 8, 4, 6, 9, 10, 1, 5, 8, 2));

        Stream<Integer> numberStream = numbers.stream();

        numberStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Stream<Integer> sortedStream = numbers.stream().sorted();

        sortedStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        Optional<Integer> minValue = numbers.stream().min(Integer::compare);

        System.out.println("MIN: " + minValue.get());

        Optional<Integer> maxValue = numbers.stream().max(Integer::compare);
       
        System.out.println("MAX: " + maxValue.get());

        numbers.stream().sorted().filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));
        System.out.println();

        numbers.stream().sorted().filter(i -> i % 2 != 0).filter(i -> i > 5).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
