import java.util.*;

public class ValidParenthesis {
    public static boolean checkParenthesis(String str){
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "(())";
        System.out.println(checkParenthesis(str));        

    }
}
