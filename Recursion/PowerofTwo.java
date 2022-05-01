public class PowerofTwo {
    public static boolean isPowerofTwo(int num){
        if(num==1){
            return true;
        }
        else if(num>1 && num%2==0){
            return  isPowerofTwo(num/2);
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 128;
        System.out.println(isPowerofTwo(num));
    }
}
