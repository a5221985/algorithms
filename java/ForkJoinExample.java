import java.util.concurrent.*;

public class ForkJoinExample {
    public static void print(double[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        double[] array = new double [100];

        for (int i = 0; i < array.length; i++)
            array[i] = Math.random() * array.length;
 
        print(array); 

        ParallelSquareRoot psr = new ParallelSquareRoot(0, array.length, array);      
        psr.invoke();
        System.out.println();
         
        print(array); 
    }
}

public class ParallelSquareRoot extends RecursiveAction {
    int start;
    int end;
    int thresholdSize = 10;
    double[] array;

    public ParallelSquareRoot(int start, int end, double[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    @Override
    public void compute() {
        if (end < start)
            return;

        if ((end - start) < thresholdSize) {
            for (int i = start; i < end; i++)
                array[i] = Math.sqrt(array[i]);
            return;
        }

        int mid = (start + end) >> 1;
        invokeAll(new ParallelSquareRoot(start, mid, array), new ParallelSquareRoot(mid, end, array));
    }
}
