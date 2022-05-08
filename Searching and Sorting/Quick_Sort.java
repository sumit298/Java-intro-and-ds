import java.util.Scanner;

public class Quick_Sort {
    public static int[] takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("The sorted elements are" + arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
    public static void main(String[] args) {
        int[] arr = takeInput();
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
