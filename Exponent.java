public class Exponent {
	public long powerRecursive(int a, int b) {
		if (b == 0)
			return 1;
		long pow = powerRecursive(a * a, (b >> 1));
		if ((b & 1) ==  1)
			return pow * a;
		else
			return pow;
	}

	public long powerIterative(int a, int b) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) == 1)
				res *= a;
			a *= a;
			b >>= 1;
		}
		return res;
	}

	public static void main(String[] args) {
		Exponent exp = new Exponent();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a + "^" + b + " = " + exp.powerRecursive(a, b));
		System.out.println(a + "^" + b + " = " + exp.powerIterative(a, b));
	}
}
