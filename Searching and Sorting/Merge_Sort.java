public class Merge_Sort {
    public static void mergeSort(int arr[], int sI, int eI){
        if(sI>=eI){
            return;
        }
        int mid = (sI+eI)/2;
        mergeSort(arr, sI, mid);
        mergeSort(arr, mid+1, eI);
        merge(arr, sI, eI);

    }
    public static void merge(int arr[], int sI, int eI){
        int mid = (sI+eI)/2;
        int ans[] = new int[eI-sI+1];
        int i= sI;
        int j = mid+1;
        int k=0; 
        while(i<=mid && j<=eI){
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                
                k++;
                i++;
            }
            else{
                ans[k] = arr[j];
                k++;
                j++;
            }
            
        }
        while(i<=mid){
            ans[k] = arr[i];
            k++;
            i++;
            
        }
        while(j<=eI){
            ans[k] = arr[j];
            k++;
            j++;
        }
        for(int index=0; index<ans.length; index++){
            arr[sI+index] = ans[index];
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,9,2,4,6,8,10};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
