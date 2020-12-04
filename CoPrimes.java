import java.util.BitSet;

public class CoPrimes {
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int[] findCoPrimes(int num) {
        BitSet candidates = new BitSet(num + 1);
        candidates.set(1);
        int coprime = 0;
        for (int i = 2; i < num; i++) {
            if (gcd(num, i) == 1) {
		for (int j = candidates.nextSetBit(0); (coprime = i*j) < num; j = candidates.nextSetBit(j + 1)) {
		    candidates.set(coprime);
		}            
            }
        }
        System.out.println(candidates);
        return null;
    }

    public static void main(String[] args) {
        CoPrimes cp = new CoPrimes();
        int num = 36;
        int[] coPrimes = cp.findCoPrimes(num);
    }
}
