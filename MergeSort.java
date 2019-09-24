import java.util.Arrays;

public class MergeSort {
    public static Integer[] sort(Integer[] a) {
        int i = 0;
        int j = a.length - 1;
        return _sort(a, i, j);
    }

    static Integer[] _sort(Integer[] a, int start, int end) {
        if (start == end)
            return new Integer[] {a[start]};
        int mid = (start + end) / 2;
        Integer[] left = _sort(a, start, mid);
        Integer[] right = _sort(a, mid + 1, end);
        return _merge(left, right);
    }

    static Integer[] _merge(Integer[] a, Integer[] b) {
        Integer[] c = new Integer[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
        return c;
    }

    public static void main(String[] args) {
        Integer[] a = {3, 1, 2, 6, 4, 9, 7, 8, 5};

        Integer[] b = MergeSort.sort(a);

        System.out.println(Arrays.asList(b));
    }
}
