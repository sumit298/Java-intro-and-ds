package HashSetCollection;

import java.util.HashSet;

public class HashsetCollection {
    // What is Hashset?
    // Hashset is a data structure that implements the Set interface.
    // It is a data structure that stores elements in no particular order, and does not allow duplicate elements.
    // The set implementation is based on a hash table.
    public static void main(String[] args) {
        HashSet<Integer> hashset  = new HashSet<>();
        for(int i=0; i<10; i++) {
            hashset.add((int)Math.floor(Math.random()*100));

        }
        hashset.add(50);
        hashset.add(100);
        hashset.add(100);
        System.out.println(hashset);

        // remove() removes the specified element from this set if it is present.
        System.out.println(hashset.remove(100));
        // contains() -boolean - returns true if this set contains the specified element.
        System.out.println(hashset.contains(50));
        // isEmpty() - boolean - returns true if this set contains no elements.
        System.out.println(hashset.isEmpty());
        // size() - int - returns the number of elements in this set.
        System.out.println(hashset.size());
        // clear() - void - removes all of the elements from this set.
        hashset.clear();
        System.out.println(hashset);




    }
}

// How hashset working internally?
// Hashset uses hash table to store the elements.
// Hashset uses hash function to hash the elements.
// And when duplicates are added, the hash function will return the same hash value for the duplicate element.
// So, it doesn't allow duplicate elements.

// Time Complexity: O(1) for all operations.
// Space Complexity: O(n) for all operations.