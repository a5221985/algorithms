import java.util.BitSet;

public class PrimeNumbers {
    public int[] getPrimesLessThanOrEqualTo(int num) {
        if (num < 2)
            return new int [0];
        BitSet candidates = new BitSet(num);
        candidates.set(2);
        boolean isPrime = false;
        for (int i = 3; i <= num; i++) {
            isPrime = true;
            for (int j = candidates.nextSetBit(0); j > 0 && j < i; j = candidates.nextSetBit(j + 1)) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                candidates.set(i);
        }

        int[] primes = new int [candidates.cardinality()];
        int k = 0;
        for (int i = candidates.nextSetBit(0); i > 0 && i <= num; i = candidates.nextSetBit(i + 1)) {
            primes[k++] = i;
        }
        return primes;
    }

    void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        PrimeNumbers pn = new PrimeNumbers();
        int num = 1000;
        int[] primes = pn.getPrimesLessThanOrEqualTo(num);
        pn.print(primes);
    }
}
