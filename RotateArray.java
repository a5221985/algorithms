public class RotateArray {

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void rotateArray(int[] a, int d) {
		int value = a[0];
		d = d % a.length;
		
		if (d == 0)
			return;

		int index = a.length - d;

		while (index != 0) {
			value = swap(a, index, value);
			index = index < d? a.length + index - d: index - d;
		}

		a[index] = value;
	}

	public static int swap(int[] a, int index, int value) {
		int temp = a[index];
		a[index] = value;
		return temp;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		printArray(a);

		rotateArray(a, 13);

		printArray(a);
	}
}
