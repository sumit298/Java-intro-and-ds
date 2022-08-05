package HashSetCollection;

import java.util.TreeSet;

public class TreeSetCollection {
    // What is TreeSet?
    // TreeSet is a data structure that implements the Set interface.
    // It basically does the same thing as HashSet, but it sorts the elements in the set.
    // The set implementation is based on a binary search tree.
    
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0; i<10; i++) {
            treeSet.add((int)Math.floor(Math.random()*100));
        }
        System.out.println(treeSet);
    }

}

// Time Complexity: O(log(n)) for all operations.
// Space Complexity: O(n) for all operations.
