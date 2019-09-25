public class ConvertString {
	public Integer stoi(String s) {
		Integer r = 0;
		int i = 0;
		boolean neg = false;
		if (s.charAt(i) == '-') {
			i++;
			neg = !neg;
		}
		for (int j = i; j < s.length() && isDigit(s.charAt(j)); j++)
			r = 10 * r + (s.charAt(j) - '0');
		if (neg)
			r = -r;
		return r;
	}

	Boolean isDigit(Character c) {
		return c >= '0' && c <= '9';
	}

	public static void main(String[] args) {
		ConvertString cs = new ConvertString();
		Integer i = cs.stoi("123");
		System.out.println(i);
		i = cs.stoi("-123");
		System.out.println(i);
	}
}
