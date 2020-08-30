package main.com.kv.leetcode.medium;

public class CaesarCipher {
    public static void main(String[] args) {
        String input ="abcABC89";
        int shift = 3;
        System.out.println(getCipher(input,shift));
    }

    /**
     *
     * @param input
     * @param shift
     * @return cipher string
     */
    private static String getCipher(String input, int shift) {
        StringBuffer sb = new StringBuffer();
        for (char c :input.toCharArray()){
            if(c>='a' && c<='z'){
                int origPos = c-'a';
                int newPos = (origPos+shift)%26;
                char newChar = (char) (newPos+'a');
                sb.append(newChar);
            }else if(c>='A' && c<='Z'){
                int origPos = c-'A';
                int newPos = (origPos+shift)%26;
                char newChar = (char) (newPos+'A');
                sb.append(newChar);
            }else if(Character.getNumericValue(c)>=1 && Character.getNumericValue(c)<=9){
                int newPos = (Character.getNumericValue(c)+shift)%10;
                char newChar = (char) (newPos+'0');
                sb.append(newChar);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
