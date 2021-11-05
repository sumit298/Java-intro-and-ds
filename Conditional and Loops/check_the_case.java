import java.util.Scanner;

public class check_the_case{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c = str.charAt(0);
        s.close();
        if(c >= 65 && c <= 90){
            System.out.println(1);
        }
        else if(c>=97 && c<=122){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}