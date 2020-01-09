public class QuickSort {
    public void sort(Integer[] a) {
        sort(a, 0, a.length - 1);
    }

    void sort(Integer[] a, int low, int high) {
        if (low < 0 || low >= a.length || high < 0 || high >= a.length || low >= high || a.length <= 1)
            return;
        int mid = (low + high) / 2;
        int index = partition(a, low, high, mid);
        sort(a, low, index - 1);
        sort(a, index + 1, high);
    }

    int partition(Integer[] a, int low, int high, int mid) {
        if (low < 0 || low >= a.length || high < 0 || high >= a.length || low >= high)
            return mid;
        while (low < high) {
            if (low == mid || a[low] < a[mid])
                low++;
            if (high == mid || a[high] > a[mid])
                high--;
            if (a[low] > a[mid] && a[high] < a[mid]) {
                swap(a, low, high);
                low++;
                high--;
            }
        }
        if (low == high) {
            swap(a, low, mid);
            mid = low;
        }
        return mid;
    }

    void swap(Integer[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    void print(Integer[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        Integer[] a = new Integer[] {5, 2, 8, 7, 3, 4, 9, 1, 6};
        System.out.println("Original Array:");
        qs.print(a);
        qs.sort(a);
        System.out.println("Sorted Array:");
        qs.print(a);

        Integer[] b = new Integer[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Original Array:");
        qs.print(b);
        qs.sort(b);
        System.out.println("Sorted Array:");
        qs.print(b);

        Integer[] c = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array:");
        qs.print(c);
        qs.sort(c);
        System.out.println("Sorted Array:");
        qs.print(c);
        
        Integer[] d = new Integer[] {2, 1, 4, 3, 6, 5, 8, 7, 9};
        System.out.println("Original Array:");
        qs.print(d);
        qs.sort(d);
        System.out.println("Sorted Array:");
        qs.print(d);

        Integer[] e = new Integer[] {5, 4, 3, 2, 1, 6, 7, 8, 9};
        System.out.println("Original Array:");
        qs.print(e);
        qs.sort(e);
        System.out.println("Sorted Array:");
        qs.print(e);

        Integer[] f = new Integer[] {1, 3, 5, 7, 9, 8, 6, 4, 2};
        System.out.println("Original Array:");
        qs.print(f);
        qs.sort(f);
        System.out.println("Sorted Array:");
        qs.print(f);
    }
}
