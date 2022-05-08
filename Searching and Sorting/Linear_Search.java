import java.util.Scanner;

public class Linear_Search {
    public static int[] takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int LinearSearch(int[] arr){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int key = scan.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = takeInput();
        int key = LinearSearch(arr);
        if(key == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + key);
        }
        
    }
}
