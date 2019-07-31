import java.util.BitSet;
import java.lang.Character;

public class Pangram {
	public static void main(String[] args) {
		//String input = "the quick brown fox jumps over the lazy dog";
		String input = "We promptly judged antique ivory buckles for the next prize";

		BitSet alpha = new BitSet();

		for (int i = 0; i < input.length(); i++)
			if (Character.toLowerCase(input.charAt(i)) >= 'a' && Character.toLowerCase(input.charAt(i)) <= 'z')
				alpha.set(Character.toLowerCase(input.charAt(i)));

		if (alpha.cardinality() == 26)
			System.out.println("pangram");
		else
			System.out.println("Not pangram");
	}
}
