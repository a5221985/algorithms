import java.util.List;
import java.util.ArrayList;

public class CopyOf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Ahmed", "Max", "Ravi"));
        System.out.println(list);

        List<String> copyOfList = List.copyOf(list);
        System.out.println(copyOfList);

        copyOfList.add("Bob");
    }
}
