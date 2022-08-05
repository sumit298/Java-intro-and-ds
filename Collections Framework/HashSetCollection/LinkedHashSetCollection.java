package HashSetCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetCollection {
    // What is LinkedHashSet?
    // LinkedHashSet is a data structure that implements the Set interface.
    // It is a data structure that stores elements in no particular order, and does not allow duplicate elements.
    // The set implementation is based on a hash table.

    // difference between Hashset and LinkedHashSet?
    // LinkedHashset is an ordered version of Hashset.
    // LinkedHashset maintains the order of the elements in the set.
    // but both hashset and linkedHash set doesn't allow duplicate elements.

    // But in sourcecode of LinkedHashSet there are only calling constructors of HashSet.
    // So, LinkedHashSet is a subclass of HashSet.

    
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for(int i=0; i<10; i++) {
            linkedHashSet.add((int)Math.floor(Math.random()*100));
        }
        System.out.println(linkedHashSet);
    }
}

// Time Complexity: O(1) for all operations.
// Space Complexity: O(n) for all operations.

