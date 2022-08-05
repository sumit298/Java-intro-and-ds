public class CeilingNumber {
    public static int ceilingofNumber(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,9,22,34};
        int target = 14;
        System.out.println(ceilingofNumber(arr,target));
    }
}
