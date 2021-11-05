public class LargestElement {
    public static int largestElementOfArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = ArrayUse.arrInput();
        System.out.println("Largest Element of Array is : "+largestElementOfArray(arr));
    }
}
