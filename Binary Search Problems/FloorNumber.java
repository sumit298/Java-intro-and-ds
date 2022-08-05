public class FloorNumber {
    public static int floorofNumber(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(target> arr[mid]){
                low = mid+1;
            }
            else if(target < arr[mid]){
                high = mid-1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,9,22,34};
        int target = 14;
        System.out.println(floorofNumber(arr,target));
    }
}
