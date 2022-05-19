public class MergeTwoSortedArray {
    public static void mergeTwoSortedArray(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int i=0; 
        int j=0; 
        int k=0;
        int resultArray[] = new int[m+n]; 
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                resultArray[k] = arr1[i];
                k++;
                i++;
            }
            else{
                resultArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            resultArray[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n){
            resultArray[k] = arr2[j];
            k++;
            j++;
        }
        for(int l=0; l<resultArray.length; l++){
            System.out.print(resultArray[l] + " ");
        }

        
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,5,6,9};
        int arr2[] = {2,4,6,8,10};
        mergeTwoSortedArray(arr1, arr2);
    }
    // Time Complexity: O(m+n)
    
}
