public class House_Robber {
    public static int rob(int arr[]){
        if(arr.length==0) return 0;
        int dp[] = new int[arr.length+1];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i=2; i<dp.length; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i-1]);
        }
        return dp[arr.length];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(rob(arr));
    }
}
