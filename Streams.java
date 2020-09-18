import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collection;

public class Streams {
    
    public static <T> List<T> sort(Collection<T> collection) {
        return collection.stream()
                      .sorted()
                      .collect(Collectors.toList());
    }

    public static <T> void print(Collection<T> collection) {
        collection.forEach(System.out::println);
    }
  
    public static void main(String[] args) {
        List<String> dogs = Arrays.asList("Vizsla", "Lab", "Golden", "GSP", "Poodle", "Yorkie", "Mutt");

        List<String> sortedDogs = Streams.sort(dogs);
        Streams.print(sortedDogs);
    }
}
