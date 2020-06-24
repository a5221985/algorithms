public class Pow {

    public Double pow(Double x, Integer y) {
        double power = x;
        int p = y;
        int q = 0;
        double t = 0.0;
        while (p > 1 || q > 0) {
            System.out.println(power + ", " + p + ", " + q);
            if (p > 1) {
                t = power;
                power *= power;
            }
            if (q > 0)
                power *= t;
            q = p % 2;
            p = p / 2;
        }
        return power;
    }

    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.pow(2.0, 10));
    }
}
