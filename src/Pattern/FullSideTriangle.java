package Pattern;

public class FullSideTriangle {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= 2 *n ; i++) {

            int totalJ = i > n ? 2*n -i : i ;

            for (int j = 1; j <= totalJ; j++) {
                //System.out.print(j);
                System.out.print("* ");


            }
            System.out.println();


        }
    }
}
