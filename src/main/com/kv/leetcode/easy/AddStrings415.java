package main.com.kv.leetcode.easy;

/**
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 *
 * Note:
 *
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings415 {
    public static void main(String[] args) {
        System.out.println(addStrings("121","151"));
    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String addStrings(String num1, String num2) {
        int carry =0;
        StringBuffer sb = new StringBuffer();
        for(int i=num1.length()-1, j = num2.length()-1;i>=0 || j>=0; i--,j--){
            int x = i<0 ? 0 :num1.charAt(i)-'0';
            int y = j<0 ? 0 :num2.charAt(j)-'0';
            sb.append((x+y+carry)%10);
            carry = (x+y+carry)/10;
        }
        if(carry!=0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
