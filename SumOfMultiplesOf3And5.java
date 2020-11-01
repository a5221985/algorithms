public class SumOfMultiplesOf3And5 {
    public int sum() {
        int sum = 0;
        for (int i = 3; i < 1000; i += 3) {
            sum += i;
        }

        for (int i = 5; i < 1000; i += 5) {
            if (i % 15 != 0)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfMultiplesOf3And5 somo3a5 = new SumOfMultiplesOf3And5();
        System.out.println(somo3a5.sum());
    }
}
