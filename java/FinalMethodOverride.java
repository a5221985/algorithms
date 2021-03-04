public class FinalMethodOverride {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

public class A {
    public final void show() {
        System.out.println(this.getClass().getName());
    }
}

public class B extends A {
    @Override
    public void show() {
        System.out.println(this.getClass().getName());
    }
}
