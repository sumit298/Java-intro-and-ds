public class _202_Happy_Number {
    public static boolean isHappy(int n){
        int sum = 0; 
        
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem;
            n = n / 10;
        }

        if(sum == 1){
            return true;
        
        }else if(sum == 4){
            // If the sum is 4, the function returns false because it has been observed that all unhappy numbers will eventually reach the sum of 4. If the sum is neither 1 nor 4, the function calls itself with the sum as the argument, and the process repeats until the sum is either 1 or 4.            

            return false;
        }
        return isHappy(sum);


    }
}
