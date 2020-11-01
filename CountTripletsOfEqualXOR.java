public class CountTripletsOfEqualXOR {
    public int countTriplets(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int[][] computed = new int[arr.length][arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            computed[i][i] = arr[i];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                computed[i][j] = computed[i][j - 1] ^ arr[j];
            }
        }
        for (int i = 0; i < computed.length; i++) {
            for (int j = 0; j < computed[i].length; j++) {
                System.out.print(computed[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (computed[i][j - 1] == computed[j][k]) {
                        count++;
                        System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }
        return count;
    } 

    public static void main(String[] args) {
        CountTripletsOfEqualXOR ctoex = new CountTripletsOfEqualXOR();
        int[] arr = new int [] {2, 3, 1, 6, 7};
        System.out.println(ctoex.countTriplets(arr));
    }
}
