public class SwappingNumbersInPlace {
    public void swap(int[] array) {
        array[1] -= array[0];
        array[0] += array[1];
        array[1] = array[0] - array[1];
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 10;
        int[] array = {x, y};
        System.out.println("x: " + array[0] + ", y: " + array[1]);
        SwappingNumbersInPlace snip = new SwappingNumbersInPlace();
        snip.swap(array);
        System.out.println("x: " + array[0] + ", y: " + array[1]);
    }
}
