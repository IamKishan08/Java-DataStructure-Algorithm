package DataStructure50;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        Solutions countColor = new Solutions();
        countColor.BruteForceSolutions(arr);
        System.out.println(Arrays.toString(arr));

    }
}

class Solutions{

    public void BruteForceSolutions(int[] arr){
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zero++;
            } else if (arr[i]==1) {
                one++;
            }
            else {
                two++;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < (zero+one); i++) {
            arr[i] = 1;
        }
        for (int i = (one+zero); i < (zero+one+two); i++) {
            arr[i] = 2;
        }
    }

    /*________________________________________________________________________________*/

    public void optimalSolution(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int i = 0;
        while (i<=high){
           if(arr[i]==0){
               int temp = arr[i];
               arr[low] = arr[i];
               arr[low] = temp;
               low++;
               i++;
           } else if (arr[i]==2) {
              int temp = arr[i];
              arr[high] = arr[i];
              arr[high]=temp;
           }

        }


    }

}
