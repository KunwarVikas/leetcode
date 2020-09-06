package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class PalindromeStringFirstSolution {
    public static void main(String[] args) {
        boolean output = checkIfPalindrome("abcdcba");
        if(output) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

    }

    private static boolean checkIfPalindrome(String input) {
        System.out.println(input);
        if("null".equals(input))
            return false;
        else{
            input = input.replaceAll("\\s", "");
            String reverse = "";
            for(int i=input.length()-1 ; i>=0 ; i--){
               reverse = reverse + input.charAt(i);
            }
            System.out.println(reverse);
            if(input.equals(reverse)){
                return true;
            }
        }
        return false;
    }
}
