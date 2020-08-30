package main.com.kv.leetcode;

public class MakeArraysEqual1460 {
    public static void main(String[] args) {
        int [] target = new int [] {1,2,3,4};
        int [] arr = new int [] {1,3,4,2};
        System.out.println("Are arrays equal :"+ canBeEqual(target,arr));
    }

    /**
     *
     * @param target
     * @param arr
     * @return
     */
    public static boolean canBeEqual(int[] target, int[] arr) {
        //soution 1
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // return Arrays.equals(target,arr);

        //solution 2
        int [] df = new int[1001];
        for(int i=0;i<arr.length;i++){
            df[target[i]]++;
            df[arr[i]]--;
        }
        for(int i=1;i<1000;i++){
            if(df[i]!=0){
                return false;
            }
        }
        return true;
    }

}
