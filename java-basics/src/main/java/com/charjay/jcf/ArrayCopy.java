package com.charjay.jcf;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        {
            int[] a = new int[10];
            a[0] = 0;
            a[1] = 1;
            a[2] = 2;
            a[3] = 3;
            System.arraycopy(a, 2, a, 3, 3);
            a[2]=99;//数组后移，在2位置插入一个值
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");//0 1 99 2 3 0 0 0 0 0
            }
        }
        System.out.println("");
        {
            int[] a = new int[3];
            a[0] = 0;
            a[1] = 1;
            a[2] = 2;
            int[] b = Arrays.copyOf(a, 10);//数组复制
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]+" ");//0 1 2 0 0 0 0 0 0 0
            }
        }
    }
}
