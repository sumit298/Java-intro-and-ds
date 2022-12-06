import java.util.HashMap;

public class _451_Sort_Character_By_Frequency {
    public static String frequency_sort(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            int maxFreq = 0;
            char maxFreqChar = ' ';
            for(char key: map.keySet()){
                if(map.get(key) > maxFreq){
                    maxFreq = map.get(key);
                    maxFreqChar = key;
                }
            }
            for(int j = 0; j < maxFreq; j++){
                sb.append(maxFreqChar);
            }
            map.remove(maxFreqChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequency_sort(s));
    }
}
