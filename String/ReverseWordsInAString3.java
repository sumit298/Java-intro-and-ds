public class ReverseWordsInAString3 {
    // Input: s = "Let's take LeetCode contest"
    // Output: "s'teL ekat edoCteeL tsetnoc"
    public static String reverseWords(String s){
        int left = 0;
        int right = 0;
        char c[] = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            // looking for spaces 
            if(c[i] == ' ' || i == s.length()-1){
                // r is the index before the space
                // if s[i] is space, then we want to reverse s[l : i - 1]
                // if s[i] is the last character, then we want to reverse s[l : i]
                right = i == s.length()-1 ? i : i-1;
                 // swap the character
                // e.g. s = `Let's` where l is 0 and r is 4
                // Let's -> set'L -> s'teL
                while(left<right){
                    char temp = c[left];
                    c[left] = c[right];
                    c[right] = temp;
                    left++;
                    right--;

                }
                // update left pointer which is i + 1
                // i.e. the first index of the next word if applicable
                left = i + 1;

            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
}
