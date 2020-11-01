import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++)
            stack.push(i);
        
        for (Integer item : stack)
            System.out.println(item);    
    }
}
