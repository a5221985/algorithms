public class Test {
    Test() {
        this();
        System.out.println("Test class object is created");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
