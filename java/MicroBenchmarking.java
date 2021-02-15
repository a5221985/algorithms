import java.util.BitSet;

public class MicroBenchmarking {
    BitSet primes = new BitSet();
    int prevMaxNum = -1;

    public MicroBenchmarking() {
    }

    public boolean isPrime(int num) {
        int maxCandidate = (int) Math.sqrt(num);
        for (int i = 2; i <= maxCandidate; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public boolean isPrime2(int num) {
        if (num < 2)
            return false;
        if (num == 2)
            return true;
        if (primes.get(num))
            return false;
        if (num <= prevMaxNum)
            return !primes.get(num);
        int maxMultiple = 0;
        int nextNum = 0;
        int i = 4;
        int p = 2;
        if (prevMaxNum != -1) {
            i = (prevMaxNum >> 1) * 2 + 2;
            p = prevMaxNum;
        }
        for (; i <= num; i += 2)
            primes.set(i);
        for (i = 3; i <= num; i += 2) {
            maxMultiple = num / i;
	    for (int j = p == 2? p: (p / i) + 1; j <= maxMultiple; j++) {
		nextNum = i * j;
		if (!primes.get(nextNum))
		    primes.set(nextNum);
	    }
        }
        prevMaxNum = num;
        System.out.println(primes);
        return !primes.get(num);
    }

    public static void main(String[] args) {
        MicroBenchmarking mb = new MicroBenchmarking();
        
        // warmup period
/*        System.out.println("Finished warmup period");
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
            start = System.currentTimeMillis();
            mb.isPrime2(i);
            end = System.currentTimeMillis();
        }

        System.out.println("Finished warmup period");

        start = System.currentTimeMillis();

        for (int i = 1001; i < 5000000; i++)
            mb.isPrime2(i);      

        end = System.currentTimeMillis();
        
        System.out.println("Time taken " + (end - start) + " ms.");
*/
        //for (int i = 4; i <= 100; i++) 
        //    System.out.println(i + " is prime " + mb.isPrime2(i));
        System.out.println(mb.isPrime2(2));
        System.out.println(mb.isPrime2(3));
        System.out.println(mb.isPrime2(6));
        System.out.println(mb.isPrime2(231));
    }
}
