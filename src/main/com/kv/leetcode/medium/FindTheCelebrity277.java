package main.com.kv.leetcode.medium;

public class FindTheCelebrity277 {

    public int findCelebrity(int n){
        int candidate = 0;
        for(int i=1;i<n;i++){
            if(knows(candidate,i)){
                candidate = i;
            }
        }

        for(int i=1;i<n;i++){
            if(i!=candidate || knows(candidate,i)||!knows(i,candidate)){
                return -1;
            }
        }
        return candidate;
    }

    public boolean knows(int a, int b){
        return true;
    }
}
