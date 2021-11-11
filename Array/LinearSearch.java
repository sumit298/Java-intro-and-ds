public class LinearSearch{
    public static int linear_search(int arr[], int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = ArrayUse.arrInput();
        int searchedItem = linear_search(arr, 50);
        if(searchedItem == -1){
            System.out.println("Element not found");
        }
        else{

            System.out.println("Element found at index "+searchedItem);
        }
    }
}