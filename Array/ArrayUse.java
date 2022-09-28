
import java.util.Scanner;

public class ArrayUse {
	public static int[] arrInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array's size: ");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}
	
	

	public static  void print(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int array[] = arrInput();
		print(array);
	}
}
