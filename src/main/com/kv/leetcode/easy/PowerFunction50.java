package main.com.kv.leetcode.easy;

public class PowerFunction50 {

    public static void main(String[] args) {
        System.out.println(pow(2.1,3));
    }

    /**
     *
     * @param x
     * @param n
     * @return x to the power n
     */
    public static double pow(double x, int n) {
        if (n == -1)
            return 1 / x;
        else if(n == 1)
            return x;
        else if(n == 0)
            return 1;
        if(n%2 == 0)
            return pow(x*x, n/2);
        else
            return pow(x*x, n/2) * x;
    }
}
