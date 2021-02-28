public class DefaultConstructor {
    int i;
    String j;

    public DefaultConstructor() {
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        DefaultConstructor dc = new DefaultConstructor();
    }
}
