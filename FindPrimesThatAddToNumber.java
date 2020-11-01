public class FindPrimesThatAddToNumber {
    private List<Integer> primes = new ArrayList<>();

    public int[] find(int num) {
        if (num < 4)
            return new int [2] = {-1, -1};
                
    }

    public static void main(String[] args) {
        FindPrimesThatAddToNumber fptatn = new FindPrimesThatAddToNumber();
        int[] primes = fptatn.find(num);
        
    }
}
