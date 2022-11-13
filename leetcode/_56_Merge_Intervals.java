import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_Merge_Intervals {
    public static int[][] mergeIntervals(int[][] intervals){
        if(intervals.length <= 1){
            return intervals;
        }
        // Comparator for sorting intervals
        Arrays.sort(intervals, (arr1, arr2)-> Integer.compare(arr1[0], arr2[0]));
        List<int[]> output = new ArrayList<>();
        int currentIntervals[] = intervals[0];
        output.add(currentIntervals);
        for(int[] interval: intervals){
            // int current_begin = currentIntervals[0];
            int current_end = currentIntervals[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            if(current_end>= next_begin){
                currentIntervals[1] = Math.max(current_end, next_end);
            }   
            else{
                currentIntervals = interval;
                output.add(currentIntervals);
            }
        }
        return output.toArray(new int[output.size()][]);

    }
    public static void main(String[] args) {
        int intervals[][] = {{1,3},{2,6},{8,10},{15,18}};
        int result[][] = mergeIntervals(intervals);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
        }

    }
}
