public class StringBuilder {
    static final int DEFAULT_SIZE = 10;    
    char[] stringArray = new char[DEFAULT_SIZE];
    int capacity = DEFAULT_SIZE;
    int size = 0;

    public StringBuilder append(String string) {
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

    public String toString() {
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
