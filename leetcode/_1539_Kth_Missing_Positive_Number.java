public class _1539_Kth_Missing_Positive_Number {
    public static int findKthPositiveInteger(int arr[], int k){
        int left = 0;
        int n = arr.length;
        int right = n-1;
        int missing = compute(arr[n-1], n);
        if(missing<k){
            return arr[n-1]+k-missing;
        }
        while(left<=right){
            int mid = left + (right-left)/2;
            missing = compute(arr[mid], mid+1);
            if(missing>=k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left+k;
        
    }

    private static int compute(int actual, int expected) {
        return actual - expected;
    }
}
