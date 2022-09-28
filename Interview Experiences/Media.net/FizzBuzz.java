import java.util.Arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int n){
        String result[] = new String[n];
        for(int i=0; i<n; i++){
            if(n%5 == 0 && n%3 == 0){
                result[i] = "FizzBuzz";
            }
            else if(n%3==0){
                result[i] = "Fizz";
            }
            else if(n%5==0){
                result[i] = "Buzz";
            }
            else {
                result[i] = Integer.toString(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String result[] = fizzBuzz(50);
        System.out.println(Arrays.toString(result));
    }

}
