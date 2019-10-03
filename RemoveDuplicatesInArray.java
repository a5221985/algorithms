public class RemoveKeyInArray {
    public int[] removeKey(int[] a, int k) {
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k)
                p++;
            if (p > 0 && (i + 1) < a.length)
                a[i - p + 1] = a[i + 1];
            if (i >= (a.length - p))
                a[i] = 0;
        }
        return a;
    }    

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 3, 2, 5, 3, 4, 6, 3, 1, 6, 7, 8};
        int k = 4;

        RemoveKeyInArray rkia = new RemoveKeyInArray();
        rkia.printArray(a);

        int[] b = rkia.removeKey(a, k);
        rkia.printArray(b);
        
        k = 3;
        int[] c = rkia.removeKey(b, k);
        rkia.printArray(c);
        
        k = 6;
        int[] d = rkia.removeKey(b, k);
        rkia.printArray(d);
    }
}
