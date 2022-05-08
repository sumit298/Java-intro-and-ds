import java.util.Scanner;

public class FahCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fah = s.nextInt();
        s.close();
        int result = (int)((5.0/9) * (fah - 32));
        System.out.println(result); 
        double a = 9/5;
        System.out.println(a);      
    }
}
