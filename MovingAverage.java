import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MovingAverage {
    List<Double> values;

    public MovingAverage() {
        values = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 4.0, 3.0, 6.0, 7.0, 9.0, 10.0, 13.0, 12.0));
    }

    public List<Double> computeMovingAverages(Integer k) {
        List<Double> averages = new ArrayList<>(values.size());
        for (int i = 0; i < values.size(); i++) {
            double average = 0;
            int p = (k > (i + 1))? (i + 1): k;
            int j = 0;
            while (j < p) {
                average += values.get(i - j);
                j++;
            }
            average /= p;
            averages.add(average);
        }
        return averages;
    }

    public static void main(String[] args) {
        System.out.println("Alhamdulillah");

        MovingAverage ma = new MovingAverage();
        int k = 3;
        List<Double> averages = ma.computeMovingAverages(k);

        System.out.println(averages); 
    }
}
