package com.charjay.algorithm.suanfa;

public class MinSubArrayLen {

    public static void main(String[] args) {
        int[] arr ={2,3,1,2,4,3};
        int s = 7;
        int minLength = new MinSubArrayLen().minSubArrayLen(s, arr);
        System.out.println(minLength);
    }

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0, j = -1, sum = 0, minLength = Integer.MAX_VALUE;
        while(i < nums.length){
            if(j + 1 < nums.length && sum < s){
                sum+=nums[++j];
            }else{
                sum-=nums[i++];
            }
            if(sum >= s){
                minLength = Math.min(j-i+1, minLength);
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}
