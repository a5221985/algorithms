import java.util.stream.Stream;

public class StreamsIterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1)
              .limit(10)
              .forEach(System.out::println);

        System.out.println();
        Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
              .limit(20)
              .forEach(n -> System.out.println(n[0]));

        int sum = Stream.iterate(new int[] {0, 1}, n -> new int[] {n[1], n[0] + n[1]})
                        .limit(20)
                        .map(n -> n[0])
                        .mapToInt(n -> n)
                        .sum();

        System.out.println("\nSUM: " + sum);

        Stream.iterate(1, n -> n < 20, n -> n * 2)
              .forEach(System.out::println);
        System.out.println();

        Stream.iterate(0, n -> n + 1)
              .limit(37)
              .map(n -> n + ":\t" + Math.sqrt(n))
              .forEach(System.out::println);
        System.out.println();

        double standardDeviation = Math.sqrt(Stream.iterate(0, n -> n + 1)
              .limit(11)
              .map(n -> n * n)
              .mapToInt(n -> n)
              .sum());

        System.out.println("Standard deviation: " + standardDeviation);
    }
}
