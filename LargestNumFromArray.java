import java.util.Arrays;

public class LargestNumFromArray {
	public String generate(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}

		int maxDigits = 0;
		while (max > 0) {
			maxDigits++;
			max /= 10;
		}

		int pow = 1;
		for (int i = 0; i < maxDigits; i++) {
			final int power = pow;
			nums = Arrays.stream(nums)
				.boxed()
				.sorted((a, b) -> getDigit(b, power) - getDigit(a, power))
			        .mapToInt(p -> p)
				.toArray();
			pow *= 10;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
		}
		return sb.toString();
	}

	int getDigit(int num, int pow) {
		if (num < pow) {
			return num % (pow / 10);
		}
		return ((num / pow) % 10);
	}

	public static void main(String[] args) {
		int[] nums = {9, 3, 30, 34, 549};
		LargestNumFromArray lnfa = new LargestNumFromArray();
		System.out.println(lnfa.generate(nums));
	}
}
