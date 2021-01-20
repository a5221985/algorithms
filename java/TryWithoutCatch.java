public class TryWithoutCatch {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } finally {
            System.out.println("Finally!");
        }
    }
}
