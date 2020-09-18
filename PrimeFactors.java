import java.util.Set;
import java.util.LinkedHashSet;

public class PrimeFactors {
    public Set<Integer> findPrimesUpto(int limit) {
        if (limit < 2)
            return new LinkedHashSet<>();
        Set<Integer> primes = new LinkedHashSet<>();
        return findPrimesUpto(limit, primes);
    }

    Set<Integer> findPrimesUpto(int limit, Set<Integer> primes) {
        if (limit == 2) {
            primes.add(2);
            return primes;
        }
        boolean isPrime = true;
        for (int i = 3; i <= limit; i += 2) {
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
            isPrime = true;
        }
        return primes;
    }

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        Set<Integer> primes = pf.findPrimesUpto(100000);
        System.out.println(primes);
    }
}
