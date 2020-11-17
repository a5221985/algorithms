public class NearestLargerInArray {
    public int computeTheDistanceOfNearestLarger(int[] array, int index) {
        int i = index - 1;
        int minDistance = array.length + 1;
        while (i >= 0) {
            if (array[i] > array[index]) {
                minDistance = index - i;
                break;
            }
            i--;
        }
        i = index + 1;
        int distance = 0;
        while (i < array.length) {
            if (array[i] > array[index]) {
                distance = i - index;
                if (minDistance > distance)
                    minDistance = distance;
                break;
            }
            i++;
        }
        return minDistance;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 5, 6};
        int index = 0;
        NearestLargerInArray nlia = new NearestLargerInArray();
        int distance = nlia.computeTheDistanceOfNearestLarger(array, index);
        System.out.println(distance);
    }
}
