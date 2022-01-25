import java.util.Scanner;

public class Insertion_Sort {
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
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        InsertionSort(arr);
        printArray(arr);
    }
}
