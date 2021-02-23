import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Optional<Integer> product = numbers.stream().reduce((a, b) -> a * b);

        if (product.isPresent())
            System.out.println("product: " + product.get());

        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);

        if (sum.isPresent())
            System.out.println("sum: " + sum.get());

        Integer product1 = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println("product1: " + product1);
    }
}
