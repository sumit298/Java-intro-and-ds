public class _424_Longest_Repeating_Character_Replacement{
    public static int characterReplacement(String s, int k){
        int[] count = new int[26];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println("s = " + s + ", k = " + k);
        System.out.println("Output: " + characterReplacement(s, k));
    }
}


// This is a method that takes in a string s and an integer k, and returns the length of the longest substring of s that contains at most k characters that are not part of the most frequent character in the substring.

// The method first initializes an array count to store the frequency of each character in the string, and two variables start and maxCount to store the start index and maximum frequency of the current substring, respectively. It also initializes a variable maxLength to store the maximum length of a valid substring found so far.

// Next, it enters a loop that iterates over each character in the string. In each iteration, it increments the frequency of the current character in count and updates maxCount to be the maximum frequency of any character in the current substring. It then checks whether the number of characters in the current substring that are not part of the most frequent character exceeds k. If it does, the method removes the first character in the current substring (by incrementing start) and decrements its frequency in count.

// Finally, the method updates maxLength to be the maximum of the current length of the substring and the maximum length found so far, and returns maxLength when the loop is finished.



// int[] count = new int[26];
// int start = 0, maxCount = 0, maxLength = 0;
// These lines create an array count of size 26 to store the frequency of each character in the string, and three variables:

// start: the start index of the current substring
// maxCount: the maximum frequency of any character in the current substring
// maxLength: the maximum length of a valid substring found so far
//
// for (int end = 0; end < s.length(); end++) {
//   maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
//   while (end - start + 1 - maxCount > k) {
//       count[s.charAt(start) - 'A']--;
//       start++;
//   }
//   maxLength = Math.max(maxLength, end - start + 1);
// }
// This loop iterates over each character in the string. In each iteration, it increments the frequency of the current character in count and updates maxCount to be the maximum frequency of any character in the current substring.

// It then checks whether the number of characters in the current substring that are not part of the most frequent character exceeds k. If it does, the method removes the first character in the current substring (by incrementing start) and decrements its frequency in count.

// Finally, the method updates maxLength to be the maximum of the current length of the substring and the maximum length found so far.

// return maxLength;
// When the loop is finished, the method returns maxLength, which is the maximum length of a valid substring of s that contains at most k characters that are not part of the most frequent character in the substring.