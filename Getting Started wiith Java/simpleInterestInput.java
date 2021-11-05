import java.util.Scanner;

public class simpleInterestInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int principal = scan.nextInt();
        double rate = scan.nextDouble();
        int year = scan.nextInt();
        
        scan.close();
        double interest = principal * rate * year / 100;
        System.out.println("The interest is " + interest);

    }
}
