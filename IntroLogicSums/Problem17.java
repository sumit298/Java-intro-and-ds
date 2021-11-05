public class Problem17 {
    public static void increment(int i){
        ++i;
    }
    public static void incrementArray(int arr[]){
        for(int index = 0; index< arr.length; index++){
            arr[index]++;
        }
    }
    public static void incrementArrayVariation(int arr[]){
        arr = new int[5];
        for(int i=0; i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int num = 10;
        increment(num);
        System.out.println(num);
        int arr[] = {1,2,3,4,5};
        incrementArray(arr);
        ArrayUse.print(arr);
        // print {2,3,4,5,6}
        incrementArrayVariation(arr);
        ArrayUse.print(arr);
    }    
}

// logic behind increment()
// Here it is pass by value in case of primitive data type.
// So when in line 18 the control is passed to incrment function and value is copied to (int i) of parameter.
// But both num and i are different, just their values are same.
// in function incremnt the local parameter val increment by 1.
// And in the end of function the local value is destroyed.
// So in line 19 the value of num original 10 is printed.


// Logic behind IncrementArray()
// In line 20, I created a array named arr which stores address '[I@1f32e575'
// in which actual values are stored.
// In line 21 we are calling incremntArray() with parameter 'arr[]',
// in that parameter var arr[]'s of the main function reference is copied into the parameter arr[].
// So arr[] parameter also holds the same address '[I@1f32e575' as arr in main holds.
// In that function we are incrementing value of the arr elements by 1.
// So arr[] will be {2,3,4,5,6}.
// And when the loop ends, function ends and the local arr gets destroyed i.e collected by garbage collector.
// In line 22, we are printing arr value in the main so as it holds the same address we will see result as {2,3,4,5,6}.  

