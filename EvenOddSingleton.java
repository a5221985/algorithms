public class EvenOddSingleton {
    private static EvenOddSingleton odd;
    private static EvenOddSingleton even;
    private String info;
    private static boolean isOdd = true;

    private EvenOddSingleton(String info) {
        this.info = info;
    }

    public static EvenOddSingleton getInstance() {
        if (isOdd) {
            if (odd == null)
                odd = new EvenOddSingleton("Odd");
            isOdd = false;
            return odd;
        } else {
            if (even == null)
                even = new EvenOddSingleton("Even");
            isOdd = true;
            return even;
        }
    }

    public String info() {
        return info;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            EvenOddSingleton instance = EvenOddSingleton.getInstance(); 
            System.out.println(instance.info());   
        }
    }
}
