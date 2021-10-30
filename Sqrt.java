public class Sqrt {
	public static int find(int n) {
		int low = 2;
		int high = n;
		int mid = 0;
		int sqr = 0;
		while (low < high) {
			mid = low + ((high - low) >> 1);
			System.out.println(mid);
			sqr = mid * mid;
			if (sqr == n || sqr == (n - 1))
				return mid;
			else if (sqr < n)
				low = mid;
			else
				high = mid;
		}
		return mid;
	}

	public static void main(String[] args) {
		int n = 38;
		int sqrt = Sqrt.find(n);
		System.out.println("sqrt(" + n + ") = " + sqrt);
	}
}
