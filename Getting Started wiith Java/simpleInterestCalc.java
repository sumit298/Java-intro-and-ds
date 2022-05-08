public class simpleInterestCalc {
    public static void main(String[] args) {
        int principal = 40000;
        double rate = 7.5;
        int year = 2;
        double si = principal * rate * year / 100;
        System.out.println(si);
    }   
}
