package ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// what is collection framework?
// collection framework is a collection of classes that provide a set of useful methods for manipulating collections.

// what is collection interface?
// collection interface is an interface that defines the behavior of a collection.

// What is ArrayList?
// ArrayList is a class that implements the List interface.
public class List_ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list2D = new ArrayList<>();
        list2D.add(list);
        int sum = 0;
        list.add(1); // add element at the end of the list.
        list.add(1);
        list.add(1);
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                sum = sum + list.get(i);
            } else {
                sum = sum - list.get(i);

            }

        }

        // get the sum using for each loop;
        
        list.indexOf(1);
        System.out.println(list2D);

        System.out.println(list);
        System.out.println(sum);
        // Methods:
        list.add(2, 100); // add element at the specified index.
        List<Integer> newList = new ArrayList<>();
        newList.add(4);
        newList.add(7);
        // to update the list
        newList.set(1, 10);
        for(int i: newList){
            System.out.print(i + "  ");
        }
        list.addAll(newList); // add all elements of the specified collection to the end of this list.


        // to check if the list contains the specified element.
        System.out.println(list.contains(100)); // return true or false

        // how to get elements
        System.out.println(list.get(0));

        // how to remove elements
        list.remove(0); // remove the element at the specified index.
        System.out.println(list);
        
        list.remove(Integer.valueOf(100)); // remove the first occurrence of the specified element from this list.
        list.clear();
        System.out.println(list);

        // what is iterator?
        // iterator is an interface that defines a standard for traversing a collection of elements.
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("iterator working" + iterator.next());
        }
    }

}

// how does ArrayList work internally?

// Time Complexity:
// add() - O(1)

// add(int index, E element) - O(n) insert at position => because of the shift of the elements after the index.
// to update or set takes O(n);
// To remove an element from the middle: O(n), because we have to shift all the elements after the removed element.
