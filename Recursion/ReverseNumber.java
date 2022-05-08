public class ReverseNumber {
    static int sum = 0;
    public static void reverse(int n){
        if(n==0){
            return;
        }
        int remainder= n%10;
        sum = sum * 10 + remainder;

        reverse(n/10);
        // System.out.println(sum); 
    }
    public static void reverse2(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverse2(n/10);
        
    }
    static int count=0;
    public static int countofDigits(int n){
        if(n==0){
            return 0;
        }
        count++;
        countofDigits(n/10);
        return count;
    }
    public static void main(String[] args) {
        reverse2(1384);
        System.out.println(countofDigits(1));
        
    }
}



// // while(n!=0){
//     remainder = n%10;
//     n = n/10
//     reverse = reverse * 10 + remainder
// }