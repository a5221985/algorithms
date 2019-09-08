import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {
    public static final int DEFAULT_CAPACITY = 16;
    private T[] array;
    private int len = 0;
    private int capacity;

    public DynamicArray() {
        array = (T[]) new Object [DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public DynamicArray(int capacity) {
        array = (T[]) new Object [capacity];
        this.capacity = capacity;
    }

    public T[] getArray() {
        return array;
    }

    public int getLen() {
        return len;
    }

    public T get(int index) {
        if (index < 0 || index >= len)
            return null;
        return array[index];
    }

    public void set(int index, T item) {
        if (index < 0 || index >= len)
            return;
        array[index] = item;
    }

    void optionallyResize(int targetCapacity, int newCapacity) {
        if (len == targetCapacity) {
            T[] newArray = (T[]) new Object [newCapacity];
            for (int i = 0; i < targetCapacity; i++)
                newArray[i] = array[i];
            capacity = newCapacity;
            array = newArray;
        }
    }

    public void add(T item) {
        optionallyResize(capacity, 2 * capacity);
        array[len++] = item;
    }

    public Boolean remove(int index) {
        if (index < 0 || index >= len)
            return false;

        // O(n)
        int len_prev = len - 1;
        for (int i = index; i < len_prev; i++)
            array[i] = array[i + 1];
        len--;

        int halfCapacity = capacity / 2;
        optionallyResize(halfCapacity, halfCapacity);

        return true;
    }

    @Override
    public DynamicArrayIterator iterator() {
        return new DynamicArrayIterator<T>(this);
    }

    @Override
    public String toString() {
        if (len == 0)
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[" + array[0]);
        for (int i = 1; i < len; i++)
            sb.append(", " + array[i]);
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        DynamicArray<Integer> da = new DynamicArray<>();
        da.add(10);
        da.add(20);
        da.add(30);

        System.out.println(da.get(0));
        System.out.println(da.get(1));
        System.out.println(da.get(2));

        da.remove(0);
        System.out.println(da);

        da.remove(1);
        System.out.println(da);

        da.remove(0);
        System.out.println(da);

        for (int i = 0; i < 10000; i++)
            da.add(i);

        for (Integer item : da)
            System.out.println(item);

        //System.out.println(da);

        for (int i = 0; i < 10000; i++)
            da.remove(0);

        System.out.println(da);
        DynamicArray<Integer> da1 = new DynamicArray<>(64);
    }
}

class DynamicArrayIterator<T> implements Iterator<T> {
    T[] array;
    int len;
    int current = 0;

    public DynamicArrayIterator(DynamicArray<T> da) {
        array = da.getArray();
        len = da.getLen();
    }

    // returns false if next element does not exist
    public boolean hasNext() {
        return current < len;
    }

    // returns current data and update current;
    public T next() {
       return array[current++];
    }
}
