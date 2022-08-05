package Arrays_Class_and_Collection_Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(22);
        list.add(22);
        list.add(84);
        list.add(41);
        System.out.println("min elements: " + Collections.min(list));
        System.out.println("max elements: " + Collections.max(list));
        Collections.reverse(list);
        System.out.println("Frequency Elements of 22: " + Collections.frequency(list, 22));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }   
}
