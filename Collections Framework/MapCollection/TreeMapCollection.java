package MapCollection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {
    // Difference between HashMap and TreeMap:
    // HashMap: It does not maintain order.
    // TreeMap: It maintains order in sorted form.
    // A TreeMap contains values based on the key. It implements the NavigableMap
    // interface and extends AbstractMap class.
    // It contains only unique elements.
    // It cannot have null key but can have multiple null values.
    // It is same as HashMap instead maintains ascending order(Sorted using the
    // natural order of its key).
    public static void main(String[] args) {
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("B", "Banana");
        treeMap.put("A", "Apple");
        treeMap.put("C", "Coconut");
        treeMap.put("E", "Elderberry");
        treeMap.put("D", "Dragonfruit");


        treeMap.remove("E");
        System.out.println(treeMap);

    }
}
