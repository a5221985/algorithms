import java.util.List;
import java.util.ArrayList;

public class Hailstones {
    public static List<Integer> hailstones(int n) {
        final List<Integer> list = new ArrayList<>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
        }
        list.add(n);
        return list; 
    }

    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.exit(1);
        }
        final List<Integer> list = Hailstones.hailstones(n);
        System.out.println(list);
    }
}
