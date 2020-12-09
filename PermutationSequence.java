import java.util.List;
import java.util.LinkedList;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] appearances = new int [n];
        appearances[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            appearances[i] = (n - i - 1) * appearances[i + 1];
        print(appearances);

        List<Integer> candidates = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            candidates.add(i);
        print(candidates);
     
        return getPermutation(n, k - 1, appearances, 0, candidates);        
    }

    String getPermutation(int n, int k, int[] appearances, int index, List<Integer> candidates) {
        if (candidates.isEmpty())
            return "";
        
        int candidateIndex = k / appearances[index];
        int candidate = candidates.remove(candidateIndex);

        System.out.println("candidate: " + candidate);

        return candidate + getPermutation(n - 1, k % appearances[index], appearances, index + 1, candidates); 
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void print(List<Integer> list) {
        list.stream()
            .map(i -> i + " ")
            .forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        PermutationSequence ps = new PermutationSequence();
        int n = 4;
        int k = 16;
        System.out.println(ps.getPermutation(n, k));
    }
}
