public class ReverseArray {
    public static void reverseArrayRecursive(int arr[], int left, int  right){
        if(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseArrayRecursive(arr, ++left, --right);
        }
    }
}
