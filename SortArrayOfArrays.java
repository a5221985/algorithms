import java.util.Arrays;

public class SortArrayOfArrays {
	public static void main(String[] args) {
		int[][] array = {{2, 3}, {5, 1}, {9, 4}, {10, 7}, {2, 4}};
		Arrays.sort(array, (a, b) -> {
			return a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1];
		});

		for (int i = 0; i < array.length; i++) {
			System.out.print("(" + array[i][0] + ", " + array[i][1] + ") ");
		}
		System.out.println();
	}
}
