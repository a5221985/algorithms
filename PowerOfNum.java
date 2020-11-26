public class PowerOfNum {
    public double pow(double num, int k) {
        if (num == 0)
            return 1.0;
        if (num == 1)
            return num;
        if (num == -1)
            return 1 / num;
        if (num == Integer.MIN_VALUE) {
            if (k == 1.0 || k == -1.0)
                return 1.0;
            else
                return 0.0;
        }
        boolean isPowerNegative = k < 0 ? true : false;
        k = k < 0 ? -k : k;
        double a = num;
        double b = 1;
        int q = k;
        int r = 0;
        while (k > 1) {
            r = k & 1;
            k >>= 1;
            q = k;
            if (r == 1)
                b *= a;
            a *= a;
        }
        double power = a * b;
        return isPowerNegative ? 1.0 / power : power;
    }

    public static void main(String[] args) {
        PowerOfNum pon = new PowerOfNum();
        //double num = 1.414213562373095;
        double num = 2.0;
        int k = -2;
        System.out.println(num + "^" + k + " = " + pon.pow(num, k));
    }
}
