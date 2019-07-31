public class BuildString {

	public int cost(int a, int b, String s) {
		if (s.length() == 1)
			return a < b? a: b;

		int min = cost(a, b, s.substring(0, s.length() - 1)) + ((a < b)? a: b);
		for (int i = 2; i < s.length(); i++) {
			String prefix = s.substring(0, s.length() - i);
			String suffix = s.substring(s.length() - i, s.length());

			if (prefix.indexOf(suffix) != -1) {
				int c = cost(a, b, prefix) + b;
				if (c < min)
					min = c;
			} else
				break;
		}

		return min;
	}

	public static void main(String[] args) {
		String input = "aaaaaaaa";

		BuildString bs = new BuildString();
		System.out.println(bs.cost(4, 5, input));
	}
}
