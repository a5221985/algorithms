import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeSortedArrays {

    public Integer[] mergeAll(Integer[] ...arrays) {
        Integer[] array = null;
        for (int i = 0; i < arrays.length; i++) {
            array = merge(array, arrays[i]);
        }
        return array;
    }
    
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        if (array1 == null || array1.length == 0)
            return array2;
        if (array2 == null || array2.length == 0)
            return array1;
        int i = 0;
	int j = 0;
	int k = 0;
        Integer[] array3 = new Integer[array1.length + array2.length];
	while (i < array1.length && j < array2.length) {
	    if (array1[i].compareTo(array2[j]) <= 0) {
		array3[k++] = array1[i++];
	    } else {
		array3[k++] = array2[j++];
	    }
	}
	while(i < array1.length)
	    array3[k++] = array1[i++];
	while(j < array2.length)
	    array3[k++] = array2[j++];
        return array3;
    }

    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {1, 5, 9, 13, 17};
        Integer[] array2 = new Integer[] {2, 6, 10, 14, 18};
        Integer[] array3 = new Integer[] {3, 7, 11, 15, 19};
        Integer[] array4 = new Integer[] {4, 8, 12, 16, 20};

        MergeSortedArrays msa = new MergeSortedArrays();

//        Integer[] array4 = msa.merge(array1, array2);
//        Integer[] arrayFinal = msa.merge(array4, array3);
        Integer[] arrayFinal = msa.mergeAll(array1, array2, array3, array4);
        
        for (int i = 0; i < arrayFinal.length; i++)
            System.out.println(arrayFinal[i]);
    }
}
