package ListCollection;
import java.util.Stack;

public class StackInterface {
    // Stack is Last-In-First-Out (LIFO) data structure.
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Billy");
        stack.push("Bob");
        stack.push("Joe");
        stack.push("Mary");
        stack.push("Tom");
        System.out.println(stack.peek()); // return the top element of the stack.
        stack.pop(); // remove the top element of the stack.
        System.out.println(stack);
    }
}
