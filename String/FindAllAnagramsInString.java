import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        // Alisha approach
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int phash[] = new int[26];
        int shash[] = new int[26];

        for (int i = 0; i < p.length(); i++) {
            // for checking first length of p in s
            phash[p.charAt(i) - 'a']++;
            shash[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(phash, shash)) {
            result.add(0);
        }

        // for checking rest of the string

        for (int i = p.length(); i < s.length(); i++) {
            shash[s.charAt(i) - 'a']++;
            // remove the previous character of the window
            shash[s.charAt(i - p.length()) - 'a']--;
            if (Arrays.equals(phash, shash)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;

    }
}

// It initializes two arrays phash and shash, both with 26 elements representing
// the frequencies of each letter in the alphabet in the p and s strings,
// respectively.
// It populates the phash array by iterating through the p string and
// incrementing the corresponding element in the phash array for each character.
// It also populates the shash array by iterating through the first p.length()
// characters of the s string and incrementing the corresponding element in the
// shash array for each character.
// It checks if phash and shash are equal. If they are, it adds the index 0 to
// the result list, as this is the starting index of an anagram of p in s.
// It then enters a loop that iterates through the rest of the s string. For
// each iteration, it increments the frequency of the current character in the
// shash array and decrements the frequency of the character that is p.length()
// characters behind the current character. It then checks if phash and shash
// are equal. If they are, it adds the index i - p.length() + 1 to the result
// list, as this is the starting index of an anagram of p in s.
// After the loop completes, the result list is returned.
