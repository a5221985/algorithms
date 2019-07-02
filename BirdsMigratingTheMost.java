import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BirdsMigratingTheMost {

	public int getId(List<Integer> arr) {
		List<Integer> list = new ArrayList<>(Collections.nCopies(arr.size(), 0));
		int max = 0;
		int id = 0;

		for (int i = 0; i < arr.size(); i++) {
			int currentId = arr.get(i);
			list.set(currentId, list.get(currentId) + 1);

			if (max < list.get(currentId)) {
				max = list.get(currentId);
				id = currentId;
			} else if (max == list.get(currentId) && id > currentId) {
				id = currentId;
			}
		}

		return id;
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3));

		BirdsMigratingTheMost bmtm = new BirdsMigratingTheMost();
		int id = bmtm.getId(arr);

		System.out.println("Array: " + arr);
		System.out.println("Birds migrating the most: " + id);
	}
}
