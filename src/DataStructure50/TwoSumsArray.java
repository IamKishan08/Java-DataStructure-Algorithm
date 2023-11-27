package DataStructure50;


import java.util.Arrays;
import java.util.*;

public class TwoSumsArray {

    /*Given an Array of Two Integer and an Integer Target, Return two indices of the Two Numbers Such that they add up to Target */


    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] result = twoSumBruteForce(arr,target);
        int[] result1 = twoSumMap(arr,target);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));

    }

    //using Brute Force
    public static int[] twoSumBruteForce(int[] arr, int target){


        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
    /*________________________________________________________________________________*/
    public  static int[] twoSumMap(int[] arr,int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }


        return null;
    }

}
