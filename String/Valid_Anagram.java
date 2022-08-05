import java.util.Arrays;

public class Valid_Anagram {
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char sCharArray[] = s.toCharArray();
        char tCharArray[] = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        for (int i = 0; i < sCharArray.length; i++) {
            if (sCharArray[i] != tCharArray[i]) {
                return false;
            }
        }
        return true;
    }
}
