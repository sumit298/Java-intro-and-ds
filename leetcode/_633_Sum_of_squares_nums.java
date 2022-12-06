public class _633_Sum_of_squares_nums {
    public static boolean judgeSquareSum(int c){
        long start = 0;
        long end  = (long)Math.sqrt(c);
        while(start <= end){
            long sum = start * start + end * end;
            if(sum == c){
                return true;
            }
            else if(sum > c){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
    // Time complexity: O(sqrt(c))
    public static void main(String[] args) {
        int c = 2147483600;
        // int c = 54;
        System.out.println(judgeSquareSum(c));
    }
}
