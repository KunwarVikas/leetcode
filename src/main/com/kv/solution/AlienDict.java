package main.com.kv.solution;

import java.util.Scanner;

/**
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 * Example 2:
 *
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
 * Example 3:
 *
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 *
 *
 * Constraints:
 *
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are English lowercase letters.
 */

public class AlienDict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words using space:");
        String words = sc.nextLine();
        String [] wordsArray = words.split("\\s");
        System.out.println("Enter the alien letters order:");
        String letters = sc.next();
        boolean output = checkIfWordsAreSorted(wordsArray,letters);
        System.out.println("The words in order:" +output);
    }

    /**
     *
     * @param wordsArray
     * @param letters --> qwertyuioplkjhgfdsazxcvbnm
     * @return
     */
    private static boolean checkIfWordsAreSorted(String[] wordsArray, String letters) {
        int [] alphabets = new int[26];
        for(int i=0;i<letters.length();i++){
            alphabets[letters.charAt(i)-'a']=i;
        }

        for(int i=0;i<wordsArray.length;i++) {
            for(int j=i+1;j<wordsArray.length;j++){
                int min = Math.min(wordsArray[i].length(),wordsArray[j].length());
                for(int k=0;k<min;k++){
                    char iChar = wordsArray[i].charAt(k);
                    char jChar = wordsArray[j].charAt(k);
                    if(alphabets[iChar-'a'] < alphabets[jChar-'a']){
                        break;
                    }else if(alphabets[jChar-'a'] < alphabets[iChar-'a']){
                        return false;
                    }else if(k == min-1 && wordsArray[i].length()>wordsArray[j].length()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
