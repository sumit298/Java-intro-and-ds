public class _520_Detect_Capital {
    public boolean detectCapital(String word) {
        int capitals = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch))
                capitals++;
        }
        // case 1 and case 2
        if (capitals == word.length() || capitals == 0)
            return true;
        return capitals == 1 && Character.isUpperCase(word.charAt(0));
    }

    public boolean isCapital2(String word) {
        int capital = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                capital++;
        }

        if (capital == word.length() || capital == 0)
            return true;

        if (capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'))
            return true;
        return false;
    }
    public static void main(String[] args) {
        
    }
}
