import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _2225_Find_Players_With_One_Or_Zero_Loses {
    public static List<List<Integer>> findNumbers(int[][] matches) {
        // only 2 cases failed in leetcode
        HashMap<Integer, Integer> atleastOneLoss = new HashMap<>();
        List<Integer> atleastOneLossArray = new ArrayList<>();
        List<Integer> zeroLossArray = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matches.length; i++) {
            if (atleastOneLoss.containsKey(matches[i][1])) {
                atleastOneLoss.put(matches[i][1], atleastOneLoss.get(matches[i][1]) + 1);
            } else {
                atleastOneLoss.put(matches[i][1], 1);
            }

        }
        for (int i = 0; i < matches.length; i++) {
            // check if there is only one occurance of element then add it to the arrayList
            if (atleastOneLoss.get(matches[i][1]) == 1) {
                atleastOneLossArray.add(matches[i][1]);
            }
            // sort the arraylist
            atleastOneLossArray.sort(null);
        }
        // for(int i=0; i<matches.length; i++){
        // // just add matches[i][0] to the zeroLoss HashSet
        // zeroLossArray.add(matches[i][0]);

        // }

        for (int i = 0; i < matches.length; i++) {
            // check if zeroLoss element does not have any occurance in atleastOneLoss then
            // add it to the arrayList and if zeroLossArray element is not present in the
            // arrayList then add it to the arrayList
            if (!atleastOneLoss.containsKey(matches[i][0]) && !zeroLossArray.contains(matches[i][0])) {
                zeroLossArray.add(matches[i][0]);
            }
        }
        // sort the arraylist
        zeroLossArray.sort(null);
        result.add(zeroLossArray);
        result.add(atleastOneLossArray);
        return result;

    }

    public static List<List<Integer>> findNumbers2(int matches[][]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
        }
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (int i = 0; i < matches.length; i++) {
            if (map.get(matches[i][0]) == null) {
                zeroLoss.add(matches[i][0]);
                map.put(matches[i][0], 2);
            }
            if (map.get(matches[i][1]) == 1) {
                oneLoss.add(matches[i][1]);
            }
        }
        zeroLoss.sort(null);
        oneLoss.sort(null);
        List<List<Integer>> result = new ArrayList<>();
        result.add(zeroLoss);
        result.add(oneLoss);
        return result;

    }

    public static void main(String[] args) {
        int[][] matches = { { 1, 3 }, { 2, 3 }, { 3, 6 }, { 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 },
                { 10, 9 } };

        System.out.println(findNumbers2(matches));
    }
}
