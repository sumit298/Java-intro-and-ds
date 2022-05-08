package Assignment;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int alias = num;
        int temp = 0;
        int remainder;
        s.close();
        while(num!=0){
            remainder = num % 10;
            temp = temp * 10 + remainder;
            num = num / 10;
        }
        if(temp == alias){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not Palindrome number");
        }
    }
}
