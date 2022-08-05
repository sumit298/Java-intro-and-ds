package MapCollection;

import java.util.Hashtable;

public class HashTableCollection {
    // What is Hashtable?
    // Hashtable is a data structure that implements the Map interface.
    // It is a data structure that stores key-value pairs in a hash table.

    // Difference between Hashtable and HashMap:
    // Hashtable: keys are ordered according to their natural ordering.
    // HashMap: keys are ordered according to a Comparator.
    // HashMap: It does allows null key
    // Hashtable: It does not allows null key
    // HashMap: It is not thread-safe and unsynchronized and it is fast.
    // Hashtable: It is thread-safe and synchronized and it is slow.

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Sumit");
        hashtable.put(267, "Sumit");
        hashtable.put(33, "Sumit");
        hashtable.put(44, "Sumit");
        hashtable.put(98, "Sumit");
        hashtable.put(2584, "Sumit");
        System.out.println(hashtable);
    }
}
