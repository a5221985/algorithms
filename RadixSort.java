import java.util.List;
import java.util.ArrayList;

public class RadixSort {
	public int[] sort(int[] array) {
		List<List<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lists.add(new ArrayList<>());
		}

		int maxDigits = 0;
		int num = 0;
		int numDigits = 0;
		for (int i = 0; i < array.length; i++) {
			num = array[i];
			numDigits = 0;
			while (num > 0) {
				numDigits++;
				num /= 10;
			}
			if (maxDigits < numDigits) {
				maxDigits = numDigits;
			}
		}

		int index = 0;
		int j = 0;
		int pow = 1;
		for (int k = 0; k <= maxDigits; k++) {
			for (int i = 0; i < array.length; i++) {
				index = (array[i] / pow) % 10;
				lists.get(index).add(array[i]);
			}

			j = 0;
			for (List<Integer> list : lists) {
				for (int item : list) {
					array[j++] = item;
				}
				list.clear();
			}
			pow *= 10;
		}

		return array;
	}

	public void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {123, 76, 12, 98, 345, 982, 1, 93};
		RadixSort rs = new RadixSort();
		rs.print(rs.sort(array));
	}
}
