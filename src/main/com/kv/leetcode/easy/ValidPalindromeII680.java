package main.com.kv.leetcode.easy;

/**
 * 680. Valid Palindrome II
 * Easy
 *
 * 1840
 *
 * 117
 *
 * Add to List
 *
 * Share
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 *
 * Example 1:
 * Input: "aba"
 * Output: True
 * Example 2:
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 * Note:
 * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */
public class ValidPalindromeII680 {

    public static void main(String[] args) {
        ValidPalindromeII680 validPalindromeII680 = new ValidPalindromeII680();
        System.out.println(validPalindromeII680.validPalindrome("abca"));
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while(++l <= --r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r)
                        || isPalindrome(s, l,r - 1);
            }
        }

        return true;
    }

    /**
     *
     * @param s
     * @param from
     * @param to
     * @return
     */
    boolean isPalindrome(String s, int from, int to) {
        while(from <= to) {
            if (s.charAt(from) != s.charAt(to)) return false;
            from++; to--;
        }
        return true;
    }
}
