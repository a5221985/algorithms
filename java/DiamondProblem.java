public class DiamondProblem implements A, B {
    public static void main(String[] args) {
        DiamondProblem dp = new DiamondProblem();
        dp.show();
    }
/*
    @Override
    public void show() {
        
    }
*/
}

public interface A {
    public default void show() {
        System.out.println("A");
    }
}

public interface B {
    public default void show() {
        System.out.println("B");
    }
}
