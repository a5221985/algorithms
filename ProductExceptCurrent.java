public class ProductExceptCurrent {
    public int[] getProdsArray(int[] array) {
        if (isArrayInvalid(array))
            return getEmptyArray();
        return getProdsArrayForValidArray(array);
    }

    int[] getProdsArrayForValidArray(int[] array) {
        int[] prods = getArrayOfOnes(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j)
                    prods[i] *= array[j];
            }
        }
        return prods;
    }

    int[] getEmptyArray() {
        return new int[0];
    }

    int[] getArrayOfOnes(int size) {
        int[] array = new int [size];
        for (int i = 0; i < size; i++)
            array[i] = 1;
        return array;
    }

    public boolean isArrayInvalid(int[] array) {
        return array == null || array.length == 0;
    }

    public void print(int[] array) {
        if (isArrayInvalid(array))
            return;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        ProductExceptCurrent pec = new ProductExceptCurrent();
        
        int[] prods = pec.getProdsArray(array);
        pec.print(prods);
    }
}
