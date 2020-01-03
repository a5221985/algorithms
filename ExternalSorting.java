public class ExternalSorting {
    public Integer[] sort(Integer[] array) {
        int subArraylength = 4;
        int i = 0;
        int count = 0;
        Integer[][] subArrays = new Integer[3][subArrayLength];
        while (i < array.length) {
            int numOfElements = (array.length - i) > subArrayLength? subArrayLength: array.length - i; 
            subArrays[count++] = sortSubArray(array, i, numOfElements);
            i = i + subArrayLength;
        }
    }

    Integer[] sortSubArray(Integer[] array, int start, int size) {
        return mergeSort(array, start, size)
    }

    Integer[] mergeSort(Integer[] array, int start, int size) {
        
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {3, 2, 1, 4, 6, 5, 9, 8, 7, 10};

        ExternalSorting es = new ExternalSorting();
        Integer[] sortedArray = es.sort(array);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
        System.out.println();
    }
}
