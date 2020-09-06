package main.com.kv.leetcode.easy;

public class Sqrt69 {
    public static void main(String[] args) {
        int A = 2147395600;
        System.out.println(sqrt(A));
    }

    /**
     *
     * @param x
     * @return floor(sqrt(A))
     */
    private static int sqrt(int x) {
        if (x<2)
            return x;
        int l = 1, r = Integer.MAX_VALUE;
        while (true) {
            int mid = l + (r - l)/2;
            if (mid > x/mid) {
                r = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                l = mid + 1;
            }
        }
    }
}
