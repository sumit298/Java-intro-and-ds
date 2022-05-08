import java.util.Stack;

/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='#' && !stack1.empty()){
                stack1.pop();
            }
            else if(s.charAt(i)!= '#'){
                stack1.push(s.charAt(i) + "");
            }
        }
        for(int j=0; j<t.length();j++){
            if(t.charAt(j)=='#' && !stack2.empty()){
                stack2.pop();
            }
            else if(t.charAt(j)!='#'){
                stack2.push(t.charAt(j) + "");
            }
        }
        return stack1.equals(stack2);
    }
}
// @lc code=end

