import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class LargestIntegerFromArray {
    public String findLargestNum(int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            List<Integer> digitsA = new ArrayList<>();
            List<Integer> digitsB = new ArrayList<>();
            while (a > 0) {
                digitsA.add(a % 10);
                a /= 10;
            }

            while (b > 0) {
                digitsB.add(b % 10);
                b /= 10;
            }

            int i = digitsA.size() - 1;
            int j = digitsB.size() - 1;
            while (i >= 0 && j >= 0) {
                if (digitsA.get(i) > digitsB.get(j))
                    return -1;
                else if (digitsA.get(i) < digitsB.get(j))
                    return 1;
                else {
                    if (i == 0 && j == 0)
                        return 0;
                    if (i > 0)
                        i--;
                    if (j > 0)
                        j--;
                }
            }
            return 0;
        });

        for (int i = 0; i < array.length; i++)
            pq.add(array[i]);

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty())
            sb.append("" + pq.remove());

        return sb.toString();
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        LargestIntegerFromArray lifa = new LargestIntegerFromArray();
        int[] array = {10, 7, 76, 415};
        lifa.printArray(array);
        System.out.println(lifa.findLargestNum(array));
    }
}
