public class Sieve {
	public int[] getPrimesUpto(int n) {
		boolean[] primes = new boolean [n + 1];
		int max = (int) Math.sqrt(n);
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (!primes[i]) {
				count++;
				for (int j = i * i; j <= n; j += i) {
					if (!primes[j]) {
					    primes[j] = true;
					}
				}
			}
		}


		int[] result = new int [count];
		int k = 0;
		for (int i = 2; i <= n; i++) {
			if (!primes[i])
				result[k++] = i;
		}
		return result;
	}

	public void print(int[] array) {
		if (array == null || array.length == 0)
			System.out.println("[]");
		System.out.print("[" + array[0]);
		for (int i = 1; i < array.length; i++)
			System.out.print(", " + array[i]);
		System.out.println("]");
	}

	public static void main(String[] args) {
		Sieve sieve = new Sieve();
		int n = Integer.parseInt(args[0]);
		int[] primes = sieve.getPrimesUpto(n);
		sieve.print(primes);
	}
}
