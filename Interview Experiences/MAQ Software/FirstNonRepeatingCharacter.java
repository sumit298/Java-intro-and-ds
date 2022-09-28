import java.util.HashMap;

public class FirstNonRepeatingCharacter{
    public static void firstNonRepeat(String str){
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(countMap.containsKey(str.charAt(i))){
                countMap.put(str.charAt(i), countMap.get(str.charAt(i))+1);
            }
            else{
                countMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(countMap);
        
    }
    public static void main(String[] args) {
        String str = "aabbe";
        firstNonRepeat(str);
    }
}