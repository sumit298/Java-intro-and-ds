public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int nums[]){
        int left_pointer = 0;
        int right_pointer = nums.length-1;
        int temp;
        for(int i=0; i<nums.length-2; i++){
            if(nums[left_pointer]%2==1 && nums[right_pointer]%2==0){
                temp = nums[left_pointer];
                nums[left_pointer] = nums[right_pointer];
                nums[right_pointer] = temp;
                left_pointer++;
                right_pointer--;
            }
            else if(nums[left_pointer]%2==0){
                left_pointer++;
            }
            else{
                right_pointer--;
            }
        }
        return nums;
    }
    public static int[] sortByParity(int arr[]){
        int j=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int array[] = {2,3,5,6};
        int result[] = sortByParity(array);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]  + " ");
        }  
    }
}
