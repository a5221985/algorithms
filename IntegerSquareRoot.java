public class IntegerSquareRoot {
	// O(log 2^31) = O( 31 log 2) = O(1)
	public int sqrt(int n) {
		if (n < 0)
			return -1;
		if (n < 2)
			return n;
		if (n < 4)
			return 1;
		int low = 1;
		int high = (n >> 1);
		int mid = 0;
		int sqr = 0;
		while (low <= high) {
			mid = (low + high) >> 1;
			sqr = mid * mid;
			if (sqr == n)
				return mid;
			else if (sqr < n) {
				if (low == mid)
					return mid;
				low = mid;
			} else
				high = mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		IntegerSquareRoot isr = new IntegerSquareRoot();
		System.out.println(isr.sqrt(Integer.parseInt(args[0])));
	}
}
