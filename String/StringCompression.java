import java.util.HashMap;

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
public class StringCompression {
    public static String compression(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (count.containsKey(str.charAt(i))) {
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
            } else {
                count.put(str.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character key : count.keySet()) {
            if(count.get(key) > 1){
                sb.append(key);
                sb.append(count.get(key));
            }else{
                sb.append(key);
            }
        }
        return sb.toString();

    }

    public static int compression2(char chars[]){
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (count.containsKey(chars[i])) {
                count.put(chars[i], count.get(chars[i]) + 1);
            } else {
                count.put(chars[i], 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character key : count.keySet()) {
            if(count.get(key) > 1){
                sb.append(key);
                sb.append(count.get(key));
            }else{
                sb.append(key);
            }
        }
        for(int i=0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();

    }

    // Not my solution
    public static int compression3(char chars[]){
        char result[] = new char[chars.length];
        int index = 0;
        int count = 1;
        for(int i=0; i<chars.length; i++){
            if(i+1 < chars.length && chars[i] == chars[i+1]){
                count++;
            }else{
                result[index++] = chars[i];
                if(count > 1){
                    String str = String.valueOf(count);
                    for(int j=0; j<str.length(); j++){
                        result[index++] = str.charAt(j);
                    }
                }
                count = 1;
            }
        }
        for(int i=0; i<index; i++){
            chars[i] = result[i];
        }
        return index;

    }

    public static int compression4(String str){
        String s = str.charAt(0) + "";
        int count =1;
        for(int i=1; i<str.length(); i++){
            char prev = str.charAt(i-1);
            char current = str.charAt(i);
            if(prev == current){
                count++;
            }
            else{
                if(count > 1){
                    s+=count;
                    count = 1;
                }
                s+=current;
            }
        }
        if(count > 1){
            s+=count;
            count=1;
        }
        System.out.println(s);
        return s.length();

    }
    public static int compression5(char chars[]){
        int count=1;
        String result = chars[0] + "";
        for(int i=1; i<chars.length;i++){
            if(chars[i-1] == chars[i]){
                count++;
            }
            else{
                if(count > 1){
                    result+=count;
                    count=1;
                }
                result+=chars[i];
            }
        }
        if(count > 1){
            result+=count;
        }
        System.out.println(result);
        // store result in chars
        for(int i=0; i<result.length(); i++){
            chars[i] = result.charAt(i);
        }
        return result.length();
    }
    public static void main(String[] args) {
        String str = "abbbccca";
        System.out.println(compression4(str));

    }
}
