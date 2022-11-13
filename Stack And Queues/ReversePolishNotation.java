import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (Objects.equals(tokens[i], "+")) {
                int first = stack.peek();
                stack.pop();
                int second = stack.peek();
                stack.pop();
                stack.push(first + second);
            } else if (Objects.equals(tokens[i], "*")) {
                int first = stack.peek();
                stack.pop();
                int second = stack.peek();
                stack.pop();
                stack.push(first * second);
            } else if (Objects.equals(tokens[i], "-")) {
                int first = stack.peek();
                stack.pop();
                int second = stack.peek();
                stack.pop();
                stack.push(second - first);
            } else if (Objects.equals(tokens[i], "/")) {
                int first = stack.peek();
                stack.pop();
                int second = stack.peek();
                stack.pop();
                stack.push(second / first);
            } else {
                // in case of operands
                // how to convert integer to String
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }

    public static void main(String[] args) {
        String arr[] = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(arr));
    }
}
