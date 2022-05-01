public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    // Given two
    // string arrays
    // word1 and word2,return true if
    // the two
    // arrays represent
    // the same string,and false
    // otherwise.

    // A string
    // is represented
    // by an array if
    // the array
    // elements concatenated
    // in order
    // forms the string.

    // Example 1:

    // Input:word1=["ab","c"],word2=["a","bc"]Output:true Explanation:
    // word1 represents string"ab"+"c"->"abc"
    // word2 represents string"a"+"bc"->"abc"
    // The strings
    // are the same,so return true.Example 2:

    // Input:word1=["a","cb"],word2=["ab","c"]Output:false Example 3:

    // Input:word1=["abc","d","defg"],word2=["abcddefg"]Output:true

    // Constraints:

    // 1<=word1.length,word2.length<=103 1<=word1[i].length,word2[i].length<=103 1<=

    // sum(word1[i].length), sum(word2[i].length) <= 103
    // word1[i] and word2[i] consist of lowercase letters.

    

    public static boolean arrayStringAreEquivalent2(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for (int i = 0; i < word1.length; i++) {
            w1 += word1[i];
        }

        for (int j = 0; j < word2.length; j++) {
            w2 += word2[j];
        }

        if (w1.equals(w2)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringAreEquivalent2(word1, word2));
    }
}

// What is the time complexity of this algorithm?
// O(n)

// What i am doing here?
// I am creating a string from the word1 array and then comparing it to the word2 array.
// If the strings are the same, then return true.
// If the strings are not the same, then return false.

// build a neural network to solve this problem.
