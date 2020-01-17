import java.util.*;

public class QuickSort {
    public void sort(Integer[] a) {
        sort(a, 0, a.length - 1);
    }

    void sort(Integer[] a, int low, int high) {
        if (low < 0 || low >= a.length || high < 0 || high >= a.length || low >= high || a.length <= 1)
            return;
        int mid = low;
        int index = partition(a, low + 1, high, mid);
        sort(a, low + 1, index - 1);
        sort(a, index + 1, high);
    }

    int partition(Integer[] a, int low, int high, int mid) {
        if (low < 0 || low >= a.length || high < 0 || high >= a.length || low >= high)
            return mid;
        while (low < high) {
            if (a[low] < a[mid])
                low++;
            if (a[high] > a[mid])
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

        Set<Integer> set = new LinkedHashSet<>();
	while (set.size() < 10)
	    set.add((int)(Math.random() * 10));
	
	System.out.println("Original Array:");
	Integer[] array = set.toArray(new Integer[10]);
	qs.print(array);
	qs.sort(array);
	System.out.println("Sorted Array:");
	qs.print(array);
	set.clear();
	System.out.println();
    }
}
