import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class ReversePolishNotation {
    private Set<String> operators = new HashSet<>();
    private Map<String, Operation> operationMap = new HashMap<>();

    public ReversePolishNotation() {
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        operationMap.put("+", (num1, num2) -> num1 + num2);
        operationMap.put("-", (num1, num2) -> num1 - num2);
        operationMap.put("*", (num1, num2) -> num1 * num2);
        operationMap.put("/", (num1, num2) -> num1 / num2);
    }

    public int evaluate(String[] expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length; i++) {
            if (operators.contains(expression[i])) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = operationMap.get(expression[i]).evaluate(num1, num2);
                stack.push(result);
            } else {
                int num = atoi(expression[i]);
                stack.push(num);
            }
        }
        return stack.pop();
    }

    int atoi(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++)
            num = 10 * num + (str.charAt(i) - '0');
        return num;
    }

    public static void main(String[] args) {
        ReversePolishNotation rpn = new ReversePolishNotation();
        String[] expression = {"15", "7", "1", "1", "+", "-", "/", "3", "*", "2", "1", "1", "+", "+", "-"};
        System.out.println(rpn.evaluate(expression));
    }
}

interface Operation {
    int evaluate(int num1, int num2);
}
