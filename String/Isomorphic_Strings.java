import java.util.HashMap;

public class Isomorphic_Strings {
    public static boolean isomorphicStrings(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> ts = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(st.containsKey(s.charAt(i))){
                if(st.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                st.put(s.charAt(i), t.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(ts.containsKey(t.charAt(i))){
                if(ts.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            else{
                ts.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isomorphicStrings(s, t));
    }
}
