public class MaxWithoutIfElse {
    public int max(int num1, int num2) {
        int diff = ((num1 - num2) >>> 31);
        return num1 & (~diff) | num2 & diff;
    }

    public static void main(String[] args) {
        MaxWithoutIfElse mwie = new MaxWithoutIfElse();

        int num1 = 25;
        int num2 = 17;

        System.out.println("max(" + num1 + ", " + num2 + "): " + mwie.max(num1, num2));
    }
}
