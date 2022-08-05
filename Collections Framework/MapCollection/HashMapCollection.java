package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    // What is Map Interface?
    // Map interface is a generic interface that defines the behavior of a map.
    // A map is a data structure that maps keys to values.
    // The map is an unordered collection of key-value pairs.
    // The keys in the map must be unique.
    // The values in the map can be any type.

    // What is HashMap?
    // HashMap is a data structure that implements the Map interface.
    // It is a data structure that stores key-value pairs in a hash table.
    // The keys in the map are unique.
    // The keys are ordered according to their natural ordering.
    // The keys can be any object.
    // The values can be any object.

    // Difference between HashMap and HashSet:
    // HashMap: key-value pairs.
    // HashSet: only keys.
    // HashMap: keys are unique.
    // HashSet: keys are not unique.
    // HashMap: keys are ordered according to their natural ordering.
    // HashSet: keys are not ordered.

    // Difference between HashMap and TreeMap:
    // HashMap: keys are ordered according to their natural ordering.
    // TreeMap: keys are ordered according to a Comparator.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        // difference between HashMap and Map Class:
        // HashMap: keys are ordered according to their natural ordering.
        // Map: keys are ordered according to a Comparator.

        map.put(1, "one");
        map.put(2, "two");
        // does not allow duplicate keys.
        map.put(2, "II");
        System.out.println(map);
        // put() method adds a key-value pair to the map.
        // If the key already exists in the map, the old value is replaced by the new
        // value.

        // Checking for key exits or not.
        if (!map.containsKey(1)) {
            map.put(1, "I");
        }
        // or
        map.putIfAbsent(1, "I");
        System.out.println(map);

        // Checking for values exists or not
        if (!map.containsValue("One")) {
            map.put(1, "I");
        }

        // get() method returns the value to which the specified key is mapped, or null
        // if this map contains no mapping for the key.
        System.out.println("get() = " + map.get(1));
        // or
        System.out.println("Get value by getDefault " + map.getOrDefault(1, "I"));

        // How to iterate inside HashMap?
        // So whatever the value is present in maps, an entry is created for it.
        // So Basically an entry class is there and in that way elements keeps getting
        // added to the map.
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key, value = " + entry.getKey() + " " + entry.getValue());
        }

        map2.put(1, "Rahul");
        map2.put(2, "Ravi");
        map2.put(1, "Raj");

        for (Map.Entry<Integer, String> e : map2.entrySet()) {
            System.out.println("Key, Value = " + e.getKey() + " " + e.getValue());
        }

        // if you want only key map.keySet()
        for (Integer key : map2.keySet()) {
            System.out.println("key: " + key);
        }

        for (String value : map.values()) {
            System.out.print("Values :" + value + " ");
        }

    }
}

// Time Complexity: O(1) for all operations.
// Space Complexity: O(n) for all operations.
// where n is the number of elements in the map.
