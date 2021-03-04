public class OverloadingStaticMethod {
    public static void main(String[] args) {
        Parent.name();
        Child.name();
    }
}

public class Parent {
    public static void name() {
        System.out.println("static method from Parent");
    }
}

public class Child extends Parent {
    public static void name() {
        System.out.println("static method from Child");
    }
}
