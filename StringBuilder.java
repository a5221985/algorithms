public class StringBuilder {
    static final int DEFAULT_SIZE = 10;    
    char[] stringArray;
    int capacity;
    int size = 0;

    public StringBuilder() {
        this(DEFAULT_SIZE);
    }

    public StringBuilder(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("initialCapacity cannot be negative");
        stringArray = new char[initialCapacity];
        capacity = initialCapacity;
    }

    public synchronized StringBuilder append(String string) {
        resizeIfRequired(string.length());
        copy(string);
        return this;
    }

    void resizeIfRequired(int length) {
        if (isFull(length))
            resize();
    }

    void copy(String string) {
        for (int i = 0; i < string.length(); i++)
            stringArray[size++] = string.charAt(i);
    }

    boolean isFull(int length) {
        return (size + length) >= capacity;
    }

    void resize() {
        capacity *= 2;
        char[] newStringArray = new char[capacity];
        copy(newStringArray);
    }

    void copy(char[] newStringArray) {
        for (int i = 0; i < stringArray.length; i++)
            newStringArray[i] = stringArray[i];
        stringArray = null;
        stringArray = newStringArray;
    }

    public synchronized String toString() {
        return new String(stringArray);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b")
          .append("c")
          .append("d")
          .append("e")
          .append("f")
          .append("g")
          .append("h")
          .append("i")
          .append("j")
          .append("k")
          .append("l")
          .append("m")
          .append("n")
          .append("o")
          .append("p")
          .append("q")
          .append("r")
          .append("s")
          .append("t")
          .append("u")
          .append("v")
          .append("w")
          .append("x")
          .append("y")
          .append("z");
        
        System.out.println(sb.toString());
    }
}
