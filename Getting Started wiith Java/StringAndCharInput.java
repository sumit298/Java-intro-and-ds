import java.util.Scanner;

public class StringAndCharInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = s.nextLine();
        System.out.println(str);
        System.out.println("Now enter a character");
        char c = str.charAt(0);
        s.close();
        System.out.println(c);
    }
}
