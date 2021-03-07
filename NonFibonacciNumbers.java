import java.util.List;
import java.util.ArrayList;
import java.util.BitSet;

public class NonFibonacciNumbers {
    public List<Integer> generate(int n) {
        BitSet numbers = new BitSet(n + 1);
        int index = 0;
        int[] fibs = {0, 1};
        int sum = 0;
        int k = 1;
        List<Integer> nonFibs = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            index = i % 2;
            sum = fibs[0] + fibs[1];
            if (sum > n)
                break;
            fibs[index] = sum;
            while (k < fibs[index])
                nonFibs.add(k++);
            k++;
        }
        return nonFibs;
    }

    public static void main(String[] args) {
        NonFibonacciNumbers nfn = new NonFibonacciNumbers();
        int n = 100;
        List<Integer> nonFibs = nfn.generate(n);
        System.out.println(nonFibs);
    }
}
