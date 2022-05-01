public class _1toN {
    static void onetoN(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        onetoN(n-1);
        // System.out.println(n);
    }
    public static void main(String[] args) {
        onetoN(5);
    }
}
