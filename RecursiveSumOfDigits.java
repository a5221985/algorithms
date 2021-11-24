public class RecursiveSumOfDigits {
	public int sumOfDigits(int n) {
		if (n < 10)
			return n;
		return (n % 10) + sumOfDigits((n / 10));
	}

	public static void main(String[] args) {
		RecursiveSumOfDigits rsod = new RecursiveSumOfDigits();
		int n = 12345678;
		System.out.println(rsod.sumOfDigits(n));
	}
}
