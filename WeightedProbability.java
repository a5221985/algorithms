public class WeightedProbability {
	public double generateRandomValue(double[] probabilities, double[] nums) {
		double random = Math.random();

		double[] ranges = generateRanges(probabilities);

		int index = getIndex(ranges, random);

		return (index != -1) ? nums[index] : Integer.MIN_VALUE;
	}

	double[] generateRanges(double[] probabilities) {
		double[] ranges = new double[probabilities.length];
		ranges[0] = probabilities[0];
		for (int i = 1; i < probabilities.length; i++) {
			ranges[i] = ranges[i - 1] + probabilities[i];
		}
		return ranges;
	}

	int getIndex(double[] ranges, double random) {
		int low = 0;
		int high = ranges.length;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) >> 1;
			if (random <= ranges[mid] && (mid > 0 && random >= ranges[mid - 1] || mid == 0))
				return mid;
			else if (random > ranges[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		WeightedProbability wp = new WeightedProbability();
		double[] probabilities = {0.1, 0.5, 0.2, 0.2};
		double[] nums = {1.0, 2.0, 3.0, 4.0};
		System.out.println(wp.generateRandomValue(probabilities, nums));
	}
}
