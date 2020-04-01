package com.charjay.algorithm.suanfa;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr ={1,8,6,2,5,4,8,3,7};
        new MaxArea().maxArea(arr);
    }

    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while(i < j){
            max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
