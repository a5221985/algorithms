public class OverloadWithDifferentReturnType {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, int b) {
        return (double) (a + b);
    }

    public static void main(String[] args) {
        OverloadWithDifferentReturnType overloadWithDifferentReturnType = new OverloadWithDifferentReturnType();
    }
}
