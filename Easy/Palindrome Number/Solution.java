package palindrome.number;

public class Solution {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        String xStrReverse = new StringBuilder(xStr).reverse().toString();
        return xStr.equals(xStrReverse);
    }
}