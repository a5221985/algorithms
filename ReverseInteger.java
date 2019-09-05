public class ReverseInteger {
	
	public static Integer reverseInteger(Integer input) {
		int output = 0;
		while (input != 0) {
			output = output * 10 + input % 10;
			input /= 10;
		}
		return output;
	}
	
	public static void main(String[] args) {
		int input = 123456789;
		int output = reverseInteger(input);
		System.out.println(output);
	}
}
