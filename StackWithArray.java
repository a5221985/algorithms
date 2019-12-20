@SuppressWarnings("unchecked")
public class StackWithArray<T> {
    public static final int DEFAULT_SIZE = 10;
    T[] stack = (T[]) new Object[DEFAULT_SIZE];
    private int top = -1;    

    public void push(T data) {
        optionallyResize();
        stack[++top] = data;
    }

    public T pop() {
        if (isEmpty())
            return null;
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    void optionallyResize() {
        if (top == stack.length - 1)
            resize(stack.length * 2, stack.length);
        else if (top == stack.length / 4 - 1)
            resize(stack.length / 2, stack.length / 4);
    }

    void resize(int length, int originalLength) {
        T[] newStack = (T[]) new Object[length];
        copy(newStack, originalLength);
        stack = null;
        stack = newStack;
    }

    void copy(T[] newStack, int length) {
        for (int i = 0; i < length; i++)
            newStack[i] = stack[i];
    }

    public static void main(String[] args) {
        StackWithArray<Integer> stack = new StackWithArray<>();
        for (int i = 0; i < 500; i++)
            stack.push(i);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }
}
