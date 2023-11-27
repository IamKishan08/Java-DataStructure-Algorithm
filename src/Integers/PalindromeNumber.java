package Integers;

public class PalindromeNumber {
    public static void main(String[] args) {
       int x = 1231;
       palindromeSolution ans = new palindromeSolution();

        boolean result = ans.isPalindrome(x);
        System.out.println(result);
    }
}

class palindromeSolution{
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        if(x != 0 && x % 10 ==0){
            return false;
        }
        int reverse= 0;
        while (x>reverse){
           int lastdigit = x % 10;
           reverse = reverse *10 + lastdigit;
           x = x/10;
        }
        return (x==reverse) || (x == reverse/10) ;
    }
}
