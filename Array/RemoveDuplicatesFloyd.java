public class RemoveDuplicatesFloyd {
    public static int removeDuplicates(int arr[]){
        int tortoise = arr[0];
        int hare = arr[0];
        while(true){
            tortoise = arr[tortoise];
            hare = arr[arr[hare]];
            if(tortoise == hare){
                break;
            }
        }
        int pointer1 = arr[0];
        int pointer2 = tortoise;
        while(pointer1!=pointer2){
            pointer1 = arr[pointer1];
            pointer2 = arr[pointer2];
        }
        return pointer1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,5,4,6};
        System.out.println(removeDuplicates(arr));
    }
}
