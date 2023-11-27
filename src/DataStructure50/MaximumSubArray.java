package DataStructure50;

public class MaximumSubArray {

    public static void main(String[] args) {


        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int n = arr.length;

        Solution result = new Solution();

        int finalRes = result.KadaneApproach(arr,n);

        int BruteForce = result.BruteForceMethod(arr,n);

        System.out.println(finalRes);//Kadane Algorithm log(n)
        System.out.println(BruteForce);//BruteForce log(n^3)
    }


}
class Solution{

    public int BruteForceMethod(int[] arr,int n){
        if(arr == null || arr.length==0){
            return 0;
        }
        int maxSum = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                for (int k = i; k <=j ; k++) {
                    currentSum += arr[k];
                }
                maxSum = Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }

    /*________________________________________________________________________________*/

    public int KadaneApproach(int[] arr,int n){
        int sum = 0;
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
               sum =0;
            }
        }
        return maxi;
    }

}
