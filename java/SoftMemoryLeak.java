import java.util.List;
import java.util.ArrayList;

public class SoftMemoryLeak {
    public static void main(String[] args) throws InterruptedException {
        List<String> strings = new ArrayList<>();

        int count = 0;
        while (true) {
            Thread.sleep(1);
            strings.add("item: " + (count++));
            System.out.println(strings.get(strings.size() - 1));
        }
    }
}
