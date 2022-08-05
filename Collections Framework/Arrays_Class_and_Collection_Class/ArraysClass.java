package Arrays_Class_and_Collection_Class;

import java.util.Arrays;

public class ArraysClass {
    // What is Arrays Class
    // Arrays class is a class that contains static methods for creating and manipulating arrays.
    public static void main(String[] args) {
        int randArr[] = {3,4,6,1,99,25,14};
        int arr[] = {2,3,5,6,7,9};
        int x = Arrays.binarySearch(arr, 9);
        System.out.println(x);
        Arrays.sort(randArr); // sort the array in ascending order.
        Arrays.fill(randArr, 98); // fill entire the array with 98.
        
        System.out.println(Arrays.toString(randArr)); // print the array in sorted order.
        // convert array into arrayList
        // ex. int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.asList(arr); // convert array into arrayList.
        
    }
}
