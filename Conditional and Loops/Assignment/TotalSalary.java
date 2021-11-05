package Assignment;
import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        int basicSalary = scan.nextInt();
        System.out.println("Enter your Grade:");
        String str = scan.next();
        char grade = str.charAt(0);
        scan.close();
        double pf, allow, hra, da, TotalSalary;
        hra = (20 * basicSalary) / 100.0;
        da = (50 * basicSalary) / 100.0;
        pf = (11 * basicSalary) / 100.0;
        switch (grade) {
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            case 'C':
                allow = 1300;
                break;
            default:
                allow = 1300;
                break;
        }
        TotalSalary = basicSalary + hra + da + allow - pf;
        System.out.println(Math.round(TotalSalary));

    }
}
