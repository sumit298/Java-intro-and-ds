import java.util.HashMap;

public class _299_Bulls_And_Cows {
    public static String getHint(String secret, String guess){
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i=0; i<secret.length(); i++){
            if(count.containsKey(secret.charAt(i))){
                count.put(secret.charAt(i), count.get(secret.charAt(i)) + 1);
            }else{
                count.put(secret.charAt(i), 1);
            }
        }
        int bulls = 0;
        int cows = 0;
        for(int i=0; i<guess.length(); i++){
            if(count.containsKey(guess.charAt(i))){
                if(count.get(guess.charAt(i)) > 0){
                    cows++;
                    count.put(guess.charAt(i), count.get(guess.charAt(i)) - 1);
                }
            }
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
                cows--;
            }
        }
        return bulls + "A" + cows + "B";


    }
}

// Explaination:

// 1. We use a HashMap to store the count of each character in the secret string.
// 2. We iterate through the guess string and check if the character is in the HashMap.
// 3. If it is, we increment the cows count and decrement the count of the character in the HashMap.
// 4. If the character in the secret string is equal to the character in the guess string, we increment the bulls count and decrement the cows count.
// 5. We return the bulls and cows count.

// Time Complexity: O(n) where n is the length of the secret string.
// Space Complexity: O(n) where n is the length of the secret string.

