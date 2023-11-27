package Integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4};
        SigNumSolution ans = new SigNumSolution();
        int answer = ans.singleNumber(arr);
        System.out.println(answer);
    }
}
 class SigNumSolution {

    //Brute Force Method
    public int singleNumber(int[] nums) {
        Set<Integer> answer = new HashSet<>();
        if(nums.length==1){
            return nums[0];
        }
        for(int i = 0 ; i < nums.length;i++) {
            if(answer.contains(nums[i])){
                answer.remove(nums[i]);
            }
            else{
                answer.add(nums[i]);
            }
        }
        //System.out.println(answer);
        return answer.iterator().next();

    }
}
