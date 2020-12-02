import java.util.Stack;

public class ReverseStackWithoutTempDataStructure {
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;
        int topVal = stack.pop();
        reverse(stack);
        insertAtTheBottom(stack, topVal);
    }

    void insertAtTheBottom(Stack<Integer> stack, int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        int topVal = stack.pop();
        insertAtTheBottom(stack, val);
        stack.push(topVal);
    }

    public static void main(String[] args) {
        ReverseStackWithoutTempDataStructure rswtds = new ReverseStackWithoutTempDataStructure();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 20; i++)
            stack.push(i);
        System.out.println(stack);
        rswtds.reverse(stack);
        System.out.println(stack);
    }
}
