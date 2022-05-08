package Assignment;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        double sum = 0;
        int remainder, count = 0;
        s.close();
        while(num != 0){
            num=num/10;
            count++;
        }
        System.out.println("No of digits"+ count);
        num = temp;
        while (num != 0) {
            remainder = num % 10;
            sum = sum + Math.pow(remainder, count);
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong num");
        } else {
            System.out.println("Not Armstrong");
        }
    }

}
