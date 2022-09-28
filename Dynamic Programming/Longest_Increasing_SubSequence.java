public class Longest_Increasing_SubSequence {
    
    public static int LIS(int arr[]){
        int result[] = new int[arr.length];
        for(int i=0; i<result.length; i++){
            result[i] = 1;
        }
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    result[i] = Math.max(result[i], result[j]+1);
                }
            }

        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<result.length; i++){
            if(result[i] > max){
                max = result[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,-1,0,2,3};
        System.out.println(LIS(arr));
    }
}
