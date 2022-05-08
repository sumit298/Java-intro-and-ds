public class Sum_of_digits {
    public static int digit_sum(int n){
        if(n<1){
            return 0;
        }
        return n%10 + digit_sum(n/10);

    }      

    public static int Product_sum(int n) {
        if(n<1){
            return 1;

        }
        return n%10 * Product_sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digit_sum(578));
        System.out.println(Product_sum(57));
    }

}
