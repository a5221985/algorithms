import java.util.List;
import java.util.ArrayList;

public class GCBehaviourTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        int count = 0;
        while (true) {
            strings.add("item" + (count++));
            if (strings.size() > 10000) {
                for (int i = 0; i < 5000; i++) {
                    strings.remove(0);
                }
            }
        }
    }
}
