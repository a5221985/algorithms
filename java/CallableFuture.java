import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Future<Integer> sumFuture = executor.submit(new Sum(10));
        Future<Double> hypotenuseFuture = executor.submit(new Hypotenuse(12.0, 7.0));
        Future<Integer> factorialFuture = executor.submit(new Factorial(11));

        int sum = sumFuture.get();
        double hypotenuse = hypotenuseFuture.get();
        int factorial = factorialFuture.get();

        System.out.println("sum: " + sum);
        System.out.println("hypotenuse: " + hypotenuse);
        System.out.println("factorial: " + factorial);

        executor.shutdown();
        System.out.println("Done.");
    }
}

public class Sum implements Callable<Integer> {
    private int n;

    public Sum(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}

public class Hypotenuse implements Callable<Double> {
    private double a;
    private double b;

    public Hypotenuse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double call() {
        return Math.sqrt(a * a + b * b);
    }
}

public class Factorial implements Callable<Integer> {
    private int n;

    public Factorial(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;
        return factorial;
    }
}
