public class MethodsInInterface implements A {
    public static void main(String[] args) {
        MethodsInInterface mii = new MethodsInInterface();
        //mii.init();
        mii.show();
        System.out.println(A.add(20, 45));
    }
}

public interface A {
    public static final double PI = 3.141592;

    private void init() {
        System.out.println("A initialised");
    }

    public default void show() {
        init();
        System.out.println(this.getClass().getName());
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
