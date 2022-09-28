public class factorial {
    static int factorialofNum(int num){
        if(num == 1){
            return 1;
        }   
        int result =  num * factorialofNum(num-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorialofNum(7));
    }
}

// Recurrance Reation: T(n) = n * T(n-1);

// Time Complexity: O(n)