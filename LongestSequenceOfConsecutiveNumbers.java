public class LongestSequenceOfConsecutiveNumbers {
    public int findLength(int[] array) {
        Map<Integer, Integer> groups = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (groups.containsKey(array[i] - 1)
                groups.put(array[i], groups.get(array[i] - 1));
            else if (groups.containsKey(array[i] + 1))
                groups.put(array[i], groups.get(array[i] + 1));
            else
                groups.put(array[i], array[i]);
        }
        System.out.println(groups);
    }

    public static void main(String[] args) {
        LongestSequenceOfConsecutiveNumbers lsocn = new LongestSequenceOfConsecutiveNumbers();
        int[] array = {4, 2, 1, 6, 5};
        System.out.println(lsocn.findLength(array));
    }
}
