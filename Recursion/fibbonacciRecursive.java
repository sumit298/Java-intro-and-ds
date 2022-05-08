public class fibbonacciRecursive {
    static int fibboRecursive(int n){
        if(n==0 || n==1){
            return n; 
        }
        return fibboRecursive(n-1) + fibboRecursive(n-2);
    }
    public static void main(String[] args) {
        int n =5;
        int result = fibboRecursive(n);
        System.out.println(result);
    }
}
