package Pattern;

public class MirrorTriangle {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for ( i = 1; i <=n ; i++) {

            //Printing spaces
            for ( j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Printing Values
            for ( j = i; j <= n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for ( i = n-1; i >=1 ; i--) {

            //Printing spaces
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Printing Values
            for (j = i; j <= n ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
