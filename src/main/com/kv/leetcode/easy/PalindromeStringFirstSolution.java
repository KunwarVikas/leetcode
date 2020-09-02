package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class PalindromeStringFirstSolution {
    public static void main(String[] args) {
        System.out.print("Enter the input string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean output = checkIfPalindrome(input);
        if(output) {
            System.out.println("The string " +input+ " is palindrome");
        }
        else {
            System.out.println("The string " +input+ " is not a palindrome");
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
