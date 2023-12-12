package DataStructure50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (int[] it : ans) {
            System.out.print("[" + it[0] + ", " + it[1] + "] ");
        }
        System.out.println();
    }

    public static int[][] merge(int[][] intervals){

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int index =0;

        List<int[]> reslist = new ArrayList<>();

        while(index< intervals.length){

            int newStart = intervals[index][0];
            int currEnd = intervals[index][1];

            while(index<intervals.length-1 && currEnd>=intervals[index+1][0]){
                     currEnd = Math.max(currEnd,intervals[index+1][1]);
                     index+=1;
            }
            int newEnd = currEnd;
            reslist.add(new int[]{newStart,newEnd});
            index+=1;
        }
        index =0;
        int[][] res = new int[reslist.size()][2];

        for(int[] arr:reslist){
            res[index++] = arr;
        }

        return res;
    }
}
