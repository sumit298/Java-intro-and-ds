import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String strs[]) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<>();

        // creating frequency map
        for (String str : strs) {
            HashMap<Character, Integer> freq = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            if (bigMap.containsKey(freq) == false) {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                bigMap.put(freq, list);
            } else {
                ArrayList<String> list = bigMap.get(freq);
                list.add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> val : bigMap.values()) {
            result.add(val);
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
