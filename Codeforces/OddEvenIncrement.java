public class OddEvenIncrement {
//     Given an array a=[a1,a2,…,an] of n positive integers, you can do operations of two types on it:

// Add 1 to every element with an odd index. In other words change the array as follows: a1:=a1+1,a3:=a3+1,a5:=a5+1,….
// Add 1 to every element with an even index. In other words change the array as follows: a2:=a2+1,a4:=a4+1,a6:=a6+1,….
// Determine if after any number of operations it is possible to make the final array contain only even numbers or only odd numbers. In other words, determine if you can make all elements of the array have the same parity after any number of operations.

// Note that you can do operations of both types any number of times (even none). Operations of different types can be performed a different number of times.
    public static String oddEvenIncrement(int arr[]){
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 1;
            } else {
                arr[i] = arr[i] + 1;
            }
        }
        if (odd == even) {
            return "YES";
        }
        return "NO";
    }
}
