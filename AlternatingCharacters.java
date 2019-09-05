import java.util.Set;
import java.util.HashSet;

public class AlternatingCharacters {

	public String isPossible(String s, int i) {
		//System.out.println(s);
		if (i < s.length()) {
			if (patternMatch(s))
				return s;

			String p = isPossible(s, i + 1);
			String q = isPossible(remove(s, i), i);

			//System.out.println("p = " + p);
			//System.out.println("q = " + q);
			if (p != null) {
				if (q != null)
					if (p.length() > q.length())
						return p;
					else
						return q;
				else
					return p;
			} else
				return q;
		}
		return null;
	}

	public Boolean patternMatch(String s) {
		if (s.length() < 2)
			return false;

		String sub = s.substring(0, 2);

		int i = 2;
		while (i < s.length()) {
			if (s.substring(i, s.length()).indexOf(sub) != 0)
				return false;
			i += 2;
		}

		return true;
	}

	public String remove(String s, Integer i) {
		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < s.length(); j++)
			if (s.charAt(j) != s.charAt(i))
				sb.append(s.charAt(j));

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "bacbadbabba";

		AlternatingCharacters ac = new AlternatingCharacters();

		System.out.println(ac.isPossible(s, 0));
		//System.out.println(ac.patternMatch("ababab"));
		//System.out.println(ac.remove(s, 1));
	}
}
