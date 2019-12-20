public class Islands {

    public boolean isConnected(char[][] map, int i, int j) {
        if (i < 0 || j < 0)
            return false;
        if (i > 0 && map[i - 1][j] != '0')
            return true;
        if (j > 0 && map[i][j - 1] != '0')
            return true;
        return false;
    }

    public void markLand(char[][] map, int i, int j, char mark) {
        if (i > 0 && map[i - 1][j] != '0')
            map[i][j] = map[i - 1][j];
        else if (j > 0 && map[i][j - 1] != '0')
            map[i][j] = map[i][j - 1];
        else
            map[i][j] = mark;
    }

    public void showIslands(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int numberOfIslands(char[][] map) {
        if (map == null)
            return 0;
        int count = 0;
        char mark = '1';
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != '0' && !isConnected(map, i, j))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] map = {{'0', '0', 'x', 'x', 'x', '0', '0', 'x', 'x'}, {'0', '0', 'x', '0', '0', 'x', '0', 'x', '0'}};
        Islands islands = new Islands();
        System.out.println("Number of islands: " + islands.numberOfIslands(map));
        islands.showIslands(map);
    }
}
