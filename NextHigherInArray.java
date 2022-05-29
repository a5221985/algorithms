import java.util.Stack;

public class NextHigherInArray {
	public int[] getHigherNums(int[] array) {
		if (array == null || array.length == 0) {
			return new int[0];
		}

		int[] higher = new int[array.length];
		Stack<Integer> stack = new Stack<>();

		higher[array.length - 1] = -1;
		stack.push(array[array.length - 1]);
		for (int i = array.length - 2; i >= 0; i--) {
			if (stack.peek() > array[i]) {
				higher[i] = stack.peek();
			} else {
				while (!stack.isEmpty() && stack.peek() <= array[i]) {
					stack.pop();
				}
				if (stack.isEmpty()) {
					higher[i] = -1;
				} else {
					higher[i] = stack.peek();
				}
			}
			stack.push(array[i]);
		}
		return higher;
	}

	public void print(int[] array) {
		if (array == null || array.length == 0) {
			System.out.println("[]");
			return;
		}
		System.out.print("[" + array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		int[] array = {9, 7, 2, 1, 5, 3, 10, 12, 8};
		NextHigherInArray nhia = new NextHigherInArray();
		int[] higher = nhia.getHigherNums(array);

		nhia.print(array);
		nhia.print(higher);
	}
}
