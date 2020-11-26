import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
    public List<List<List<String>>> place(int n) {
        if (n < 1 || (n > 1 && n < 4))
            return new ArrayList<>();
        if (n == 1) {
            List<String> queen = new ArrayList<>(Arrays.asList("Q"));
            List<List<String>> placement = new ArrayList<>(Arrays.asList(queen));
            List<List<List<String>>> placements = new ArrayList<>(Arrays.asList(placement));
            return placements;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 3;
        List<List<List<String>>> placements = nQueens.place(n);
        System.out.println(placements);
    }
}
