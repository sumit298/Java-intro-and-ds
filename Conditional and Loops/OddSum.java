import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int i=1;
        int sum = 0;
        while(i<=num){
            if(i%2==1){
            sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
