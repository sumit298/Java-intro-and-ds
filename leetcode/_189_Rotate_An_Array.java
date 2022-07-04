public class _189_Rotate_An_Array {
    public static void rotateArray(int arr[], int k){
        if(k>arr.length){
            k = k% arr.length;
        }
        
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, arr.length-k, arr.length-1);
        
        reverseArray(arr, 0, arr.length-1);
    }

    public static int[] reverseArray(int arr[], int left, int right){
        if(left<right){
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            reverseArray(arr, ++left, --right);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotateArray(arr, 3);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] +  " ");
        }

    }
}
