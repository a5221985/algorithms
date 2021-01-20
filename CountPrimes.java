import java.util.BitSet;

class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2)
            return 0;
        BitSet primes = new BitSet(n + 1);
        primes.set(0, n + 1);
        primes.clear(0, 2);
        int maxVal = n / 2;
        for (int i = 2; i <= n; i += 2)
            primes.clear(i);
        if (n > 2) {
	    for (int i = 3; i <= n; i += 2) {
		if (primes.get(i)) {
		    maxVal = n / i;
		    for (int j = 2; j <= maxVal; j++) {
			primes.clear(j * i);
		    } 
		}
	    }
	    System.out.println(primes);
        }
        return primes.cardinality();
    }

    public static void main(String[] args) {
        CountPrimes cp = new CountPrimes();
        System.out.println(cp.countPrimes(100));
    }
}
