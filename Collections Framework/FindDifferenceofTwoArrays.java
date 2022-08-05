import java.util.ArrayList;
import java.util.List;

public class FindDifferenceofTwoArrays {
    public static List<List<Integer>> findDifference(int nums1[], int nums2[]) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] != nums2[j])
                    flag = 1;
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                if (!list1.contains(nums1[i]))
                    list1.add(nums1[i]);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] != nums1[j])
                    flag = 1;
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                if (!list2.contains(nums2[i]))
                    list2.add(nums2[i]);
            }
        }
        list.add(list1);
        list.add(list2);
        System.out.println(list.size());
        return list;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 4, 5 };
        int nums2[] = { 1, 2, 3, 4, 5 };
        List<List<Integer>> list = findDifference(nums1, nums2);
        System.out.println(list);
        

    }
}
