public class SimpleLoopForAssembly {
    public static void main(String[] args) {
        int[] array = new int [64 * 1024 * 10];
        int length = array.length;
        for (int i = 0; i < length; i++)
            array[i]--;
    }
}
