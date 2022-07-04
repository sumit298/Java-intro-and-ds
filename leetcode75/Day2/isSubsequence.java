public class isSubsequence {
    public static boolean isStringsSubSequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int s_pointer = 0;
        int t_pointer = 0;
        int count = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(s_pointer) == t.charAt(t_pointer)) {
                s_pointer++;
                t_pointer++;
                count++;
                if (s.length() == count) {
                    return true;
                }
            } else {
                t_pointer++;
            }
        }

        return false;
    }
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n)
    // m = s.length(), n = t.length()
    // how it is O(N^2)?    
    public static boolean isSubseqOptimal(String s, String t) {
        if (s == "") {
            return true;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubseqOptimal(s, t));
    }
}
