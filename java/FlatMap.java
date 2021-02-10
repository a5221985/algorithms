import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collection;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
        System.out.println(list);

        System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
    }
}
