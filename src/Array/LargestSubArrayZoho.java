package Array;

public class LargestSubArrayZoho {
    public static void main(String[] args) {

        int  arr[] = {1,0,1,1,1,0,0};

        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            int sum = 0;
            if(arr[i]==1){
                sum = 1;
            }
            else {
                sum = -1;
            }
            for (int j = i+1; j < n-1 ; j++) {
                

            }

        }

    }
}
