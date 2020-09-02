package main.com.kv.leetcode.easy;

import java.util.Scanner;

public class PalindromeStringSecondSolution {
    public static void main(String[] args) {
        System.out.print("Enter the input string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean output = checkIfPalindrome(input);
        if(output)
            System.out.println("The string " +input+ " is palindrome");
        else
            System.out.println("The string " +input+ " is not a palindrome");
    }

    /**
     *
     * @param input
     * @return
     */
    private static boolean checkIfPalindrome(String input) {
        System.out.println(input);
        if("null".equals(input))
            return false;
        else{
           input = input.replaceAll("\\s", "");
           int i=0; int j = input.length()-1;
           while(i<j){
               if(input.charAt(i)!=input.charAt(j))
                   return false;
               i++;
               j--;
           }
        }
        return true;
    }
}
