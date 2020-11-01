public class CopyArray {
    public static void main(String[] args) {
        int[] src = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] dst = new int [5];
        // System.arraycopy(src, srcIndex, dest, destIndex, length);
        System.arraycopy(src, 0, dst, 0, 5);
        for (int i = 0; i < dst.length; i++)
            System.out.print(dst[i] + " ");
        System.out.println();
    }
}
