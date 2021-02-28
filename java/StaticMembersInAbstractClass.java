public abstract class StaticMembersInAbstractClass {
    public static int num = 10;

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(StaticMembersInAbstractClass.add(23, 76));
    }
}
