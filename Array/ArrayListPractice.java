import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size = scan.nextInt();
        System.out.println("Enter the elements of list");
        for (int i = 0; i < size; i++) {
            list.add(scan.nextInt());
        }
        // for(int i=0; i<list.size();i++){
        // System.out.print(list.get(i) + " ");
        // }
        list.add(40);
        list.add(80);
        list.remove(2);
        // using for each loop
        for (int elem : list) {
            System.out.print(elem + 20 + " ");
        }
        list.isEmpty();
        scan.close();

    }
}
