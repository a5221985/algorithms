import java.util.Queue;
import java.util.LinkedList;

public class Dungeon {
	private Integer[][] delta = new Integer[4][2];
	private Queue<Integer> xQ = new LinkedList<>();
	private Queue<Integer> yQ = new LinkedList<>();
	private Boolean[] visitedX = new Boolean[10];
	private Boolean[] visitedY = new Boolean[10];
	private Integer[] pathX = new Integer[10];
	private Integer[] pathY = new Integer[10];

	public Dungeon() {
		delta[0] = new Integer[] {1, 0};
		delta[1] = new Integer[] {0, 1};
		delta[2] = new Integer[] {-1, 0};
		delta[3] = new Integer[] {0, -1};

		for (int i = 0; i < 10; i++) {
			visitedX[i] = false;
			visitedY[i] = false;
		}
	}

	public Boolean shortestPath(Character[][] dungeon, Integer[] source, Integer[] dest) {
		if (dungeon == null || source == null || dest == null)
			return false;
		
		xQ.add(source[0]);
		yQ.add(dest[0]);
		visitedX[0] = true;
		visitedY[0] = true;

		while(!xQ.isEmpty() && !yQ.isEmpty()) {
			Integer x = xQ.remove();
			Integer y = yQ.remove();

			for (int i = 0; i < 4; i++) {
				Integer nx = x + delta[i][0];
				Integer ny = y + delta[i][1];

				if (nx < 0 || nx > 4)
					continue;

				if (ny < 0 || ny > 4)
					continue;

				if (dungeon[nx][ny] == '#')
					continue;

				if (!visitedX[nx] && !visitedY[ny]) {
					visitedX[nx] = true;
					visitedY[ny] = true;
					pathX[nx] = x;
					pathY[ny] = y;
				}
			}
		}

		if (pathX[dest[0]] != null && pathY[dest[1]] != null)
			return true;
		else
			return false;
	}

	public Integer[] getPathX() {
		return pathX;
	}

	public Integer[] getPathY() {
		return pathY;
	}

	public static void main(String[] args) {
		Character[][] dungeon = new Character[5][5];
		dungeon[0] = new Character[] {' ', ' ', '#', ' ', '#'};
		dungeon[1] = new Character[] {'#', ' ', ' ', '#', '#'};
		dungeon[2] = new Character[] {' ', '#', ' ', ' ', '#'};
		dungeon[3] = new Character[] {' ', '#', ' ', ' ', ' '};
		dungeon[4] = new Character[] {' ', '#', ' ', '#', ' '};

		Integer[] source = new Integer[] {0, 0};
		Integer[] dest = new Integer[] {4, 4};

		Dungeon d = new Dungeon();
		Boolean isThereAPath = d.shortestPath(dungeon, source, dest);

		if (isThereAPath) {
			System.out.println("There is a path! The path is:");
			for (int x = 4, y = 4; x >= 0 && y >= 0; x = d.getPathX()[x], y = d.getPathY()[y]) {
				System.out.println("(" + x + ", " + y + ")");
			}
		}
	}
}
