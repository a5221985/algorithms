import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class SocksPairs {
	public static void main(String[] args) {
		int[] socks = {1, 2, 1, 2, 1, 3, 2};
		Set<Integer> set = new HashSet<>();
		int count = 0;
		List<Integer> pairs = new ArrayList<>();

		for (int i = 0; i < socks.length; i++) {
			if (set.contains(socks[i])) {
				count++;
				pairs.add(socks[i]);
				set.remove(socks[i]);
			} else {
				set.add(socks[i]);
			}
		}

		System.out.println("Pairs: " + count);
		pairs.stream().forEach(System.out::println);
	}
}
