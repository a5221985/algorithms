public class CompressDigits {
    public long compress(long n) {
        if (n == 0)
            return 10L;
        if (n % 10 == n)
            return (10L + n);
        long count = 1;
        long countAndSay = 0;
        long power = 0;
        long prev = -1L;
        long r = -1L;
        while (n > 0L) {
            r = n % 10;
            if (prev != -1L) {
                if (prev == r) {
                    count++;
                } else {
                    countAndSay += (count * 10 + prev) * ((long) Math.pow(10, power));
                    count = 1L;
                    power = power + 2L;
                }
            }
            n = n / 10;
            prev = r;
        }
        if (count > 0L)
            countAndSay += (count * 10 + prev) * Math.pow(10, power);
        return countAndSay;
    }

    public static void main(String[] args) {
        CompressDigits cd = new CompressDigits();
        long n = 644443322251L;
        System.out.println(cd.compress(n));
    }
}
