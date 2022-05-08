import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        s.close();
        for(int i=0;i<=num;i++){
            if(i%2==0)
            {
                sum = sum+i;
            }
            
        }
        System.out.println(sum);
    }
}
