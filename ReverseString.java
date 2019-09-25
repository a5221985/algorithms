public class ReverseString {
	public static void main(String[] args) {
		String str = "abdcefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		String reverse = sb.toString();

		System.out.println(reverse);
	}
}
