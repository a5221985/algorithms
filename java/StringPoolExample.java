import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class StringPoolExample {
    public static void main(String[] args) {
        Date start = new Date();
        List<String> strings = new ArrayList<>();
        for (Integer i = 0; i < 2000000; i++) {
            String s = i.toString().intern();
            strings.add(s);
        }
        Date end = new Date();
        System.out.println("Time taken: " + (end.getTime() - start.getTime()) + " ms.");
    }
}
