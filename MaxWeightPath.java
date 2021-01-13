public class MaxWeightPath {
    public int findMaxPathWeight(int[][] triangle) {
        return findMaxPathWeight(triangle, 0, 0);
    }

    int findMaxPathWeight(int[][] triangle, int rowIndex, int columnIndex) {
        if (rowIndex == triangle.length - 1) 
            return triangle[rowIndex][columnIndex];
        int leftWeight = findMaxPathWeight(triangle, rowIndex + 1, columnIndex);
        int rightWeight = findMaxPathWeight(triangle, rowIndex + 1, columnIndex + 1);
        return Math.max(leftWeight, rightWeight) + triangle[rowIndex][columnIndex];
    }

    public static void main(String[] args) {
        MaxWeightPath mwp = new MaxWeightPath();
        int[][] triangle = {{1}, {2, 3}, {1, 5, 1}};
        System.out.println(mwp.findMaxPathWeight(triangle));
    }
}
