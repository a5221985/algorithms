public class TrailingZerosNumInFactorial {
    public int countTrailingZerosOfFactorial(long num) {
        int count = 0;
        long factorialExtract = 1;
        for (long i = 2l; i <= num; i++) {
            factorialExtract *= i;
            System.out.println(factorialExtract);
            if (factorialExtract % 10 == 0) {
                count++;
                factorialExtract /= 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        TrailingZerosNumInFactorial tznif = new TrailingZerosNumInFactorial();
        long num = 20l;
        int countOfTrailingZeros = tznif.countTrailingZerosOfFactorial(num);
        System.out.println(countOfTrailingZeros);
    }
}
