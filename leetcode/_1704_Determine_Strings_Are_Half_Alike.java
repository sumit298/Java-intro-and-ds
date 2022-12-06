public class _1704_Determine_Strings_Are_Half_Alike {
    public static boolean halvesAreAlike(String s) {
        if (s.length() < 1) {
            return false;
        }
        int count = 0;
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);
        for (int i = 0; i < firstHalf.length(); i++) {
            if (CheckVowel(firstHalf.charAt(i))) {
                count++;
            }
            if (CheckVowel(secondHalf.charAt(i))) {
                count--;
            }
        }
        return count == 0;
    }

    public static boolean CheckVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));

    }
}
