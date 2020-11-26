public class SumOfRangeInArray {
    int[] partialSums;

    void init(int[] array) {
        if (array == null || array.length == 0)
            return;
        partialSums = new int [array.length];
        partialSums[0] = array[0];
        for (int i = 1; i < partialSums.length; i++)
            partialSums[i] = partialSums[i - 1] + array[i];
        print(partialSums);
    }

    public void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[" + array[0]);
        for (int i = 0; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    public int sum(int i, int j) {
        if (i < 0 || i > partialSums.length - 1 || j < 1 || j > partialSums.length || i >= j)
            throw new RuntimeException(i + " and " + j + " are out of range!");
        if (i == 0)
            return partialSums[j - 1];
        return (partialSums[j - 1] - partialSums[i - 1]);
    }

    public static void main(String[] args) {
        SumOfRangeInArray soria = new SumOfRangeInArray();
        int[] array = {1, 2, 3, 4, 5};
        soria.init(array);
        System.out.println(soria.sum(1, 3));
    }
}
