import java.util.List;
import java.util.ArrayList;

public class SumOfEvenFibs {
    public int sum() {
        List<Integer> fibs = new ArrayList<>(); 
        fibs.add(1);
        fibs.add(2);
        int sum = 2;
        int fib = 0;
        while ((fib = fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2)) <= 4000000) {
            if (fib % 2 == 0) {
                System.out.println(fib);
                sum += fib;
            }
            fibs.add(fib);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfEvenFibs soef = new SumOfEvenFibs();
        System.out.println(soef.sum());
    }
}
