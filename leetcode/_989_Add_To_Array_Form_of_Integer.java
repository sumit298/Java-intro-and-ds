import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _989_Add_To_Array_Form_of_Integer{
    public static List<Integer> addToArrayForm(int nums[], int k){
        List<Integer> list = new ArrayList<>();
        int carry = 0;
        int i = nums.length - 1;
        while(i >= 0 || k > 0){
            int sum = carry;
            if(i >= 0){
                sum += nums[i];
            }
            if(k > 0){
                sum += k % 10;
            }
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            k /= 10;
        }
        if(carry > 0){
            list.add(carry);
        }
        Collections.reverse(list);
        return list;

    }
    public static void main(String[] args) {
        int nums[] = {1,2,0, 0};
        int k = 34;
        System.out.println(addToArrayForm(nums, k));
    }
}