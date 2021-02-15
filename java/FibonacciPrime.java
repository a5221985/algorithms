import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FibonacciPrime {
    List<Integer> primes = new ArrayList<>();
    List<Integer> fibPrimes = new ArrayList<>();

    public boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num >= 2 && primes.isEmpty())
            primes.add(2);
        if (num == 2)
            return true;
        if (Collections.binarySearch(primes, num) >= 0)
            return true;
        int i = 0;
        if (primes.size() < 2)
            i = 3;
        else if (primes.size() > 1)
            i = primes.get(primes.size() - 1) + 2;
        boolean isNumPrime = false;
        boolean primeCandidate = true;
	for (; i <= num; i += 2) {
	    primeCandidate = true;
	    for (int prime : primes)
		if (i % prime == 0)
		    primeCandidate = false;
	    if (primeCandidate) {
		primes.add(i);
                if (i == num)
                    isNumPrime = true;
            }
        }
        System.out.println(primes);
        return isNumPrime;
    }

    public static void main(String[] args) {
        FibonacciPrime fp = new FibonacciPrime();
        System.out.println(fp.isPrime(23));
        System.out.println(fp.isPrime(22));
        System.out.println(fp.isPrime(229));
        int i = 2;
        while (true) {
            System.out.println(i + " is prime? " + fp.isPrime(i++));
        }
    }
}
