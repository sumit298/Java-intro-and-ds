import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the year");
            int year = scan.nextInt();
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }
                }
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
}
