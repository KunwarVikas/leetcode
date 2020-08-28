package main.com.kv.leetcode.medium;

import java.util.Arrays;

public class CoinChange322 {
    public static void main(String[] args) {
        int [] coins = new int[]{1,9,2,11};
        int amount = 5;
        System.out.println(coinChange(coins, amount));
    }

    /**
     *
     * @param coins
     * @param amount
     * @return minimum number of coins required.
     */
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i], 1+ dp[i - coins[j]]);
                } else {
                    break;
                }
            }
        }
        if(dp[amount] > amount) return -1;
        else return dp[amount];
    }
}
