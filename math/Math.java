public class Math {
    static final double E = 1E-20;
    static final double PI = 3.1415926535;

    public static double abs(double val) {
        return val >= 0? val: -val;
    }

    public static double differential(Function function, double k) {
        double delta_x = 1.0;
        double fok = function.evaluate(k);
        double oldVal = (function.evaluate(k + delta_x) - fok) / delta_x;
        double newVal = 0.0;
        double error = 1.0;
        while (error > E) {
            delta_x = delta_x / 2;
            oldVal = newVal;
            newVal = (function.evaluate(k + delta_x) - fok) / delta_x;
            error = abs(newVal - oldVal);
        }
        return newVal; 
    }

    public static double pow(double x, double p) {
        if (p == 0)
            return 1;
        if (p == 1)
            return x;
        if (p < 0) {
            return 1.0 / pow(x, p);
        }
        if (p > 0 && p < 1) {
            return 0.0;
        }
        double pow = 1.0;
        double m = x;
        int q = (int) p;
        while (q > 0) {
            if (q % 2 != 0)
                pow *= m;
            m *= m;
            q /= 2;
        }
        return pow;
    }

    public static double sin(double x) {
        double error = 1.0;
        double sin = 0.0;
        double numerator = x;
        double denominator = 1.0;
        double p = 1.0;
        boolean positive = true;
        double prevSin = 0.0;
        double term = 0.0;
        while (error > E) {
            term = numerator / denominator;
            term = positive? term: -term;
            prevSin = sin;
            sin += term;
            error = abs(sin - prevSin);
            numerator *= x * x;
            p += 2.0;
            denominator *= p * (p - 1);
            positive = !positive;
        }
        return sin;
    }

    public static double cos(double x) {
        return sin(PI / 2.0 - x);
    }

    public static double tan(double x) {
        double cos = cos(x);
        double sin = sin(x);
        if (cos == 0)
            return sin > 0? Double.POSITIVE_INFINITY: Double.NEGATIVE_INFINITY;
        return sin / cos;
    }

    // O((log(n))^2)
    public static int intSqrt(int x) {
        int lower = 0;
        int upper = x;
        int trial = 1;
        while ((upper - lower) > 1) {
            while ((lower + trial)*(lower + trial) < x) {
                trial <<= 1;
            }
            upper = lower + trial;
            lower += trial >> 1;
            trial = 1;
        }
        return upper*upper == x? upper: lower;
    }

    public static void main(String[] args) {
        double k = 3.0;
        double val = Math.differential(x -> 2*x*x + 3*x + 5, k);
        System.out.println(val);
        double x = 3.0;
        double p = 11.0;
        double pow = Math.pow(x, p);
        System.out.println(pow);
        double rad = Math.PI / 4.0;
        int sqr = 91;
        System.out.println(Math.sin(rad));
        System.out.println(Math.cos(rad));
        System.out.println(Math.tan(rad));
        System.out.println(Math.intSqrt(sqr)); 
    }
}

interface Function {
    double evaluate(double x);
}
