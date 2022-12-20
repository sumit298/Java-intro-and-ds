import java.util.Stack;

public class Decode_Strings {
    // Input: s = "3[a]2[bc]"
// Output: "aaabcbc"
    
    public static String decodeString(String s){
        if(s.length() < 1){
            return "";
        }
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int count = 0;
        String result = "";
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(Character.isDigit(current)){
                count = count * 10 + (current - '0');
            }
            else if(current == '['){
                countStack.push(count);
                stringStack.push(result);
                count = 0;
                result = "";
            }
            else if(current == ']'){
                int times = countStack.pop();
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<times; j++){
                    sb.append(result);
                }
                result = stringStack.pop() + sb.toString();
            }
            else{
                result += current;
            }
        }
        return result;
        
    }
}

// Explain the solution

// first check if the string is empty or not
// if it is empty return empty string
// create two stacks one for count and one for string
// create a count variable and a result variable
// loop through the string
// if the current character is a digit

// then we need to convert it to an integer
// we do this by multiplying the count by 10 and adding the current character minus '0'
// if the current character is a '['
// then we need to push the count to the count stack
// and push the result to the string stack
// then we need to reset the count and result
// if the current character is a ']'
// then we need to pop the count stack
// and create a string builder
// then we need to loop through the count
// and append the result to the string builder
// then we need to pop the string stack
// and append the string builder to the result
// if the current character is not a digit or a '[' or a ']'
// then we need to append the current character to the result
// then we need to return the result

