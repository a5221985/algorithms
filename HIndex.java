import java.util.Arrays;

public class HIndex {
    public int find(int[] citations) {
        if (citations == null || citations.length == 0)
            return 0;
        Arrays.sort(citations);
        int remainingElements = 0;
        for (int i = 0; i < citations.length; i++) {
            remainingElements = citations.length - i;
            if (remainingElements <= citations[i])
                return remainingElements;
        }
        return 0;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();

        int[] citations = {4, 3, 0, 1, 5};
        //int[] citations = {6, 4, 0, 5, 8};

        System.out.println(hIndex.find(citations));
    }
}
