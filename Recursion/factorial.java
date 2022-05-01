public class factorial {
    static int factorialofNum(int num){
        if(num == 1){
            return 1;
        }   
        return num * factorialofNum(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorialofNum(7));
    }
}
