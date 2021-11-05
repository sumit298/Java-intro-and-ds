import java.text.DecimalFormat;
import java.util.Scanner;

public class FahCelsiusTable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int step = scan.nextInt();
        scan.close();
        while(start <= end){
            double celsius = (5.0 * (start - 32))/9;
            DecimalFormat dec = new DecimalFormat("#0.00");
            System.out.print(start);
            System.out.print('\t');
            System.out.println(dec.format(celsius));
            start +=step;
        }
    }
}