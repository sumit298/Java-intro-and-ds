public class ArraySum {
    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] =  ArrayUse.arrInput();
        System.out.println("Sum of array is: " + sum(arr));

    }
}