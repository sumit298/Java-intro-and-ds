import java.util.Stack;

public class _844_Backspace_String_Compare{
    public static boolean backspaceCompare(String s, String t){
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#' && !s1.empty()){
                s1.pop();
            }
            else if(s.charAt(i)!='#'){
                s1.push(s.charAt(i)+"");
            }
        }
        for(int j=0; j<t.length();j++){
            if(t.charAt(j)=='#' && !s2.empty()){
                s2.pop();
            }
            else if(t.charAt(j)!='#'){
                s2.push(t.charAt(j) + "");
            }
        }
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        String s1 = "ab#c";
        String s2 = "ad#c";
        System.out.println(backspaceCompare(s1, s2));
    }
    
} 