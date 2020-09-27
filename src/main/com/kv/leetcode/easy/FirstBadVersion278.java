package main.com.kv.leetcode.easy;

/**
 *
 */
public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        int beg = 1;
        int last = n;
        int mid = 0;
        int pos = 0;
        while(beg<=last){
            mid = beg + (last-beg)/2;
            if(isBadVersion(mid) == true){
                pos = mid;
                last = mid-1;
            }
            else
                beg = mid+1;
        }
        return pos;
    }

    private boolean isBadVersion(int mid) {
        return true;
        //leetcode has another version. this is for dummy purpose.
    }
}
