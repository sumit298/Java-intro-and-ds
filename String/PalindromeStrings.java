public class PalindromeStrings{
    public static boolean isPalindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString().equals(s);

    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}