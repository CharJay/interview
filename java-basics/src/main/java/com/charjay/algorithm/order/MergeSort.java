package com.charjay.algorithm.order;

import java.util.Arrays;

public class MergeSort {
    public void merge(int A[], int m, int B[], int n) {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i >=0 && j>=0)
        {
            if(A[i] > B[j])
                A[k--] = A[i--];
            else
                A[k--] = B[j--];
        }
        while(j>=0)
            A[k--] = B[j--];
    }

    public static void main(String[] args) {
        //使用数组2与数组1的最后一位进行对比，大的放数组1后面，依次类推
        int[] nums1 = {1,2,7,0,0,0};
        int[] nums2 = {2,5,6};
        new MergeSort().merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
