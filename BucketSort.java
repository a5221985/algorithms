import java.util.List;
import java.util.ArrayList;

public class BucketSort {
    public double[] sort(double[] array) {
        List<Double>[] listArray = new ArrayList[array.length];
        return array;
    }

    public void print(double[] array) {

    }

    public static void main(String[] args) {
        BucketSort bs = new BucketSort();
        double[] array = {0.78, 0.17, 0.39, 0.26, 0.72, 0.94, 0.21, 0.12, 0.23, 0.68};
        double[] sorted = bs.sort(array);
        bs.print(array);
        bs.print(sorted);
    }
}
