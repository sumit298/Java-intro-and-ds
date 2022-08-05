import java.util.Arrays;

public class _238_Product_of_Array_Except_Itself {
    public static int[] productExceptItself(int arr[]) {
        int result[] = new int[arr.length];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = product;
            product = product * arr[i];
        }
        System.out.println(Arrays.toString(result));
        product = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * product;
            product = product * arr[i];

        }
        return result;
    }

    public static int[] productExceptItself2(int nums[]) {
        int result[] = new int[nums.length];
        int prefix[] = new int[nums.length + 1];
        int postfix[] = new int[nums.length + 1];
        postfix[nums.length] = 1;
        prefix[0] = 1;
        for (int i = 1; i <= nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];

        }
        for (int i = nums.length - 1; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i];
        }

        for (int k = 0; k < nums.length; k++) {
            result[k] = prefix[k] * postfix[k + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptItself2(arr)));
    }
}
