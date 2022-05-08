public class printNumber {
    static void numbers1to5(int number){
        if(number <=0)
            return;
        else{
            System.out.print(number + " ");
            numbers1to5(number - 1);
        }
    }
    static void print2ndMeth(int n){
        // if(n>5){
            
        //     return;
        // }
        
            System.out.print(n + " ");
            print2ndMeth(n+1);
        
    }
    public static void main(String[] args) {
        int number = 1;
        print2ndMeth(number);
        // numbers1to5(number);
    }
}
