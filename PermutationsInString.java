import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class PermutationsInString {
    public List<String> findPermutations(String s, String b) {
        if (s == null || s.length() == 0 || b == null || b.length() == 0 || s.length() > b.length())
            return new LinkedList<>();
        if (s.equals(b))
            return new LinkedList<>(Arrays.asList(s));

        int[] sFrequency = computeFrequencyArray(s);
        int[] bFrequency = computeFrequencyArray(b.substring(0, s.length()));

        return findPermutations(s, b, sFrequency, bFrequency);
    }

    List<String> findPermutations(String s, String b, int[] sFrequency, int[] bFrequency) {
        List<String> permutations = new LinkedList<>(); 
        for (int i = 0, j = s.length(); j <= b.length(); i++, j++) {
            if(isSame(sFrequency, bFrequency))
                permutations.add(b.substring(i, j));
            bFrequency[b.charAt(i)]--;
            if (j < b.length())
                bFrequency[b.charAt(j)]++;
        }

        return permutations;
    }

    int[] computeFrequencyArray(String str) {
        int[] frequency = new int [256];
        for (int i = 0; i < str.length(); i++)
            frequency[(int) str.charAt(i)]++;
        return frequency;
    }

    boolean isSame(int[] sFrequency, int[] bFrequency) {
        for (int i = 0; i < sFrequency.length; i++)
            if (sFrequency[i] != bFrequency[i])
                return false;
        return true;
    }

    void print(int[] frequency) {
        for (int i = 0; i < frequency.length; i++)
            System.out.print(frequency[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        PermutationsInString pis = new PermutationsInString();
        String s = "abbc";
        String b = "babcabbacaabcbabcacbb";
        List<String> permutations = pis.findPermutations(s, b);
        System.out.println(permutations);
    }
}
