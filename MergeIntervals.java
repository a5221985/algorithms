public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
    }

    public static void main(String[] args) {
        int[][] intervals = {
                                {1, 3},
                                {5, 8},
                                {4, 10},
                                {20, 25}
                            };

        MergeIntervals mi = new MergeIntervals();

        int[][] mergedIntervals = mi.merge(intervals);
    }
}
