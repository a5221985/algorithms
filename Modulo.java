public class Modulo {
	public int mod(int x, int m) {
		if (x < m)
			return x;
		int prev = m;
		int oldM = m;
		while (x >= m) {
			while (x >= m) {
				prev = m;
				m <<= 1;
			}
			x -= prev;
			m = oldM;
		}

		return x;
	}

	public static void main(String[] args) {
		Modulo modulo = new Modulo();
		System.out.println(modulo.mod(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}
