public class sumofdigits {
    public static void main(String[] args) {
        int number = 121;
        int sum = 0, remainder;
        while(number!=0){
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
