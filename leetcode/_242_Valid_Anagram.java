import java.util.Arrays;

public class _242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char tempArray[] = s.toCharArray();
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] != tempArray1[i]) {
                return false;
            }
        }
        return true;

    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char tempArray[] = s.toCharArray();
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray);
        Arrays.sort(tempArray1);
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < tempArray.length || i < tempArray1.length; i++) {
            if (tempArray[i] == tempArray1[i])
                count++;
            count1++;

        }
        if (count == tempArray.length && count1 == tempArray1.length) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";
        System.out.println(isAnagram(s1, s2));
    }
}