import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public static boolean wordPattern(String pattern, String s){
        if(pattern.length() != s.length()){
            return false;
        }
        String words[] = s.split(" ");
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!charToWord.containsKey(c)){
                charToWord.put(c, word);
            }else{
                if(!charToWord.get(c).equals(word)){
                    return false;
                }
            }

            if(!wordToChar.containsKey(word)){
                wordToChar.put(word, c);
            }else{
                if(!wordToChar.get(word).equals(c)){
                    return false;
                }
            }
        }

        System.out.println(wordToChar);
        System.out.println(charToWord);

        return true;
    }



    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    // alternate
    // class Solution {
        public boolean wordPattern2(String pattern, String s) {
            String[] words = s.split(" ");
            if (words.length != pattern.length()) {
                return false;
            }
    
            Map<Character, String> charToWord = new HashMap<>();
            Map<String, Character> wordToChar = new HashMap<>();
    
            for (int i = 0; i < pattern.length(); i++) {
                char c = pattern.charAt(i);
                String word = words[i];
    
                if (!charToWord.containsKey(c)) {
                    charToWord.put(c, word);
                }
    
                if (!wordToChar.containsKey(word)) {
                    wordToChar.put(word, c);
                }
    
                if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                    return false;
                }
            }
    
            return true;        
        }
    }

    // ans = true
    // but it showing false
    // in code somethink is wrong
    // detect it and fix i
