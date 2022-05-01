public class PowerofThree {
    public static boolean isPowerOfThree(int n){
        if(n==1){
            return true;
        }
        else if(n<=1 || n%3==0){
            return isPowerOfThree(n/3);
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(243));
    }
}
