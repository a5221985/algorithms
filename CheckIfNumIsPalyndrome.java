public class CheckIfNumIsPalyndrome {
	public boolean isPalyndrome(int num) {
		int reverse = 0;
		int temp = num;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		return reverse == num;
	}
	public static void main(String[] args) {
		System.out.println(new CheckIfNumIsPalyndrome().isPalyndrome(Integer.parseInt(args[0])));
	}
}
