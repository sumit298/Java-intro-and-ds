public class _2180_Count_Integers_With_Even_Digit_Sum {
    public static int countEven(int num){
        int count = 0;
        int sum = 0;
        int remainder;
        for(int i=2; i<num;i++){
            
        
        while(i!=0){
            remainder = i % 10;
            sum = sum + remainder;
            i = i / 10;
        }
        // System.out.println(sum);
            if(sum % 2 == 0){
                count++;
            }
            
        }
        return count;
    }
    
    public static void main(String[] args) {
        int sum = countEven(4);
        System.out.println(sum);
    }
}
