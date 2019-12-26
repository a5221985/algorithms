import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MergeSortedArrays {
    
    public Integer[] merge(Integer[] array1, Integer[] array2) {
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
        Integer[] array1 = new Integer[] {1, 4, 7, 10, 13};
        Integer[] array2 = new Integer[] {2, 5, 8, 11, 14};
        Integer[] array3 = new Integer[] {3, 6, 9, 12, 15};

        MergeSortedArrays msa = new MergeSortedArrays();

        Integer[] array4 = msa.merge(array1, array2);
        Integer[] arrayFinal = msa.merge(array4, array3);
        
        for (int i = 0; i < arrayFinal.length; i++)
            System.out.println(arrayFinal[i]);
    }
}
