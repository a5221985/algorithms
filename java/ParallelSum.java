import java.util.concurrent.*;

public class ParallelSumExample {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10000;
        int[] array = new int [size];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 1000);

        print(array);

        ParallelSum ps = new ParallelSum(0, array.length, array, 100);
        ps.fork();

        int sum = ps.join();

        System.out.println("SUM: " + sum);
    }
}

public class ParallelSum extends RecursiveTask<Integer> {
    int[] array;
    int start;
    int end;
    int thresholdSize;

    public ParallelSum(int start, int end, int[] array, int thresholdSize) {
        this.start = start;
        this.end = end;
        this.array = array;
        this.thresholdSize = thresholdSize;
    }

    @Override
    public Integer compute() {
        if ((end - start) < thresholdSize) {
            int sum = 0;
            for (int i = start; i < end; i++)
                sum += array[i];
            return sum;
        }

        int mid = (start + end) >> 1;
        ParallelSum leftSum = new ParallelSum(start, mid, array, thresholdSize);
        ParallelSum rightSum = new ParallelSum(mid, end, array, thresholdSize);

        leftSum.fork();
        rightSum.fork();

        int sum = leftSum.join() + rightSum.join();

        return sum;
    }
}
