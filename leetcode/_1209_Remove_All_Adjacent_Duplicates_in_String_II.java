import java.util.Stack;

public class _1209_Remove_All_Adjacent_Duplicates_in_String_II {
    // You are given a string s and an integer k, a k duplicate removal consists of
    // choosing k adjacent and equal letters from s and removing them, causing the
    // left and the right side of the deleted substring to concatenate together.

    // We repeatedly make k duplicate removals on s until we no longer can.

    // Return the final string after all such duplicate removals have been made. It
    // is guaranteed that the answer is unique.

    // Example 1:

    // Input: s = "abcd", k = 2
    // Output: "abcd"
    // Explanation: There's nothing to delete.
    // Example 2:

    // Input: s = "deeedbbcccbdaa", k = 3
    // Output: "aa"
    // Explanation:
    // First delete "eee" and "ccc", get "ddbbbdaa"
    // Then delete "bbb", get "dddaa"
    // Finally delete "ddd", get "aa"
    // Example 3:

    // Input: s = "pbbcggttciiippooaais", k = 2
    // Output: "ps"
    public static String remove_Duplicate(String s, int k) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (stack.isEmpty() || s.charAt(stack.peek()) != s.charAt(i)) {
                stack.push(i);
            } else {
                int count = 1;
                while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                    count++;
                }
                if (count >= k) {
                    stack.pop();
                }
            }
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(s.charAt(stack.pop()));
        }
        return sb.reverse().toString();
        
    }


    public static void main(String[] args) {
        String s = "abbxxxxzzy";
        int k = 3;
        System.out.println(remove_Duplicate(s, k));
    }
}
