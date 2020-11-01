import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LargestPrimeFactor {
    public long find(long num) {
        List<Long> primes = new ArrayList<>(Arrays.asList(2l));
        boolean isPrime = true;
        for (long i = 3l; i < 1000000l; i += 2l) {
            isPrime = true;
            for (int j = 0; j < primes.size(); j++) {
                if (i % primes.get(j) == 0l) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
                primes.add(i);
            }
        }
        System.out.println(primes);
        return 0l;
    }

    public static void main(String[] args) {
        LargestPrimeFactor lpf = new LargestPrimeFactor();
        long num = 13195;
        System.out.println(lpf.find(num));
    }
}
