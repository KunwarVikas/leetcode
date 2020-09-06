package main.com.kv.leetcode.easy;

import java.util.Scanner;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class Anagrams242 {
    public static void main(String[] args) {
        System.out.println("The words are anagrams:" +checkIfWordsAreAnagrams("abc","bca"));
    }

    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    private static boolean checkIfWordsAreAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int [] counts = new int[26];
        for(int i=0;i< s1.length();i++){
              counts[s1.charAt(i)-'a']++;
              counts[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                return false;
            }
        }
        return true;
    }

}
