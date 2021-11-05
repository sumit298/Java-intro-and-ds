import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int arr[], int element){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search: ");
        int element = sc.nextInt();
        int arr[] = ArrayUse.arrInput();
        int searchedIndex = linearSearch(arr, element);
        if(searchedIndex==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + searchedIndex);
        }
        sc.close();
    }
    
}
