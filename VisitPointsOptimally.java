public class VisitPointsOptimally {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        int diagonalDistance = 0;
        int horizontalOrVerticalDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int xi = points[i][0];
            int yi = points[i][1];
            int xj = points[i + 1][0];
            int yj = points[i + 1][1];
            int diffX = Math.abs(xj - xi);
            int diffY = Math.abs(yj - yi);
            diagonalDistance = Math.min(diffX, diffY);
            horizontalOrVerticalDistance = Math.abs(diffY - diffX);
            distance += diagonalDistance + horizontalOrVerticalDistance;
            System.out.println("diagonalDistance = " + diagonalDistance + "\n");
            System.out.println("horizontalOrVerticalDistance = " + horizontalOrVerticalDistance + "\n");
            System.out.println("distance = " + distance + "\n");
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] points = new int[3][2];
        points[0] = new int[] {1, 1};
        points[1] = new int[] {3, 4};
        points[2] = new int[] {-1, 0};
        VisitPointsOptimally vpo = new VisitPointsOptimally();
        System.out.println(vpo.minTimeToVisitAllPoints(points));
    }
}
