package Pattern;

public class SnakePatternZoho {
    public static void main(String[] args) {
        int n =4;
        int[][] arr = new int[n][n];
        int num = 1;


        for (int i = 0; i < n; i++) {

            if(n % 2 == 0){
                for (int j = 0; j < n; j++) {
                   arr[i][j] = num++;
                }
            }
            else {
                for (int j = n-1; j > 0 ; j--) {
                    arr[i][j] = num++;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(arr[i][j] == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(arr[i][j]+ " ");
                }

            }
            System.out.println();

        }

    }
}
