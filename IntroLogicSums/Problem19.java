

public class Problem19 {
    public static void incrementArray(int arr[]){
        for(int index = 0; index< arr.length; index++){
            arr[index]++;
        }
    }

    public static  void print(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

    public static void main(String[] args) {
        
        // int arr[] = {1,2,3,4,5};
        // incrementArray(arr);
        // print(arr);
        int i = -5, count = 0;
        while(i< 9 ){
            ++i;
            count++;
        }
        System.out.println(i + " " + count);

    }
}
