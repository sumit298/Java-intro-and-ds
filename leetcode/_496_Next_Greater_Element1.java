public class _496_Next_Greater_Element1 {
    public static int[] nextGreaterElement(int nums1[], int nums2[]){
        int result[] = new int[nums1.length];
        for(int i=0; i<nums1.length;i++){
            int j=0; 
            while(nums1[i]!=nums2[j]){
                j++;
            }
            while(j<nums2.length){
                if(nums2[j]>nums1[i]){
                    result[i] = nums2[j];
                    break;
                }
                j++;
            }
            if(j==nums2.length){
                result[i] = -1;
            }

        }
        return result;
    }
    
}
