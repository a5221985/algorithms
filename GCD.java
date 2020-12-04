public class GCD {
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();

        System.out.println(gcd.gcd(25, 5));
        System.out.println(gcd.gcd(25, 6));
        System.out.println(gcd.gcd(12, 9));
        System.out.println(gcd.gcd(256, 52));
    }
}
