package Pattern;

public class HalfTriangle {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++)
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                //System.out.print("*");
                System.out.print(j);

            }
            System.out.println();

        }
    }
}
