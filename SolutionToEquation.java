public class SolutionToEquation {
    public int solve() {
        for (int x = 0; x < 10000; x++) {
            double lhs = Math.pow(4, x) + Math.pow(6, x);
            double rhs = Math.pow(9, x);
            if (lhs == rhs) {
                System.out.println(lhs);
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SolutionToEquation ste = new SolutionToEquation();

        System.out.println(ste.solve());
    }
}
