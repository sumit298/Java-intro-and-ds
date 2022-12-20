import java.util.HashMap;

public class _409_Longest_Palindrome {
    public static int longestPalindrome(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        int count = 0;
        for(char c: map.keySet()){
            int value = map.get(c);
            if(value % 2 == 0){
                count += value;
            }else{
                count += value - 1;
            }
        }
        if(count < s.length()){
            count++;
        }
        return count;

    }
    public static int longestPalindrome2(String s){
        int[] char_counts = new int[128];
        for(char c: s.toCharArray()){
            char_counts[c]++;
        }
        int count = 0;
        for(Integer char_count: char_counts){
            count+= char_count/2 * 2;
            if(count%2==0 && char_count % 2 == 1){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
