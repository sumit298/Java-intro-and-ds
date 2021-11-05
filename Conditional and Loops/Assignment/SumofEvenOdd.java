package Assignment;

import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int evenSum = 0;
        int oddSum = 0;
        int n;
        while(num!=0){
            n= num%10;
            num = num / 10;
            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
