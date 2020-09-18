public class MathematicalIfCondition {
    public void printBinary(int x) {
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(1 & x);
            x >>= 1;
        }
        System.out.println(sb.toString());
    }

    public int eval(int x, int y, int b) {
        int p = (0 - b);
        return x & p | y & ~p;
    }

    public static void main(String[] args) {
        int x = 25;
        int y = 46;
        int b = 1;
        MathematicalIfCondition mic = new MathematicalIfCondition();
        int result = mic.eval(x, y, b);
        System.out.println(result);
    }
}
