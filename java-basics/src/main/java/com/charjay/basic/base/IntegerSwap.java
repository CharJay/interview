package com.charjay.basic.base;

import java.lang.reflect.Field;


public class IntegerSwap {
    public static void main(String[] args) throws Exception {
        Integer a=1,b=2;//javap -v IntegerSwap.class 查看字节码可以知道调用了Integer.valueOf()自动装箱
//        Integer a=201,b=202;
        System.out.println("a="+a+";b="+b);
        swap(a,b);
        System.out.println("a="+a+";b="+b);
    }

    /**
     * 如何交换 a与b的值
     *
     * Integer对象-128~127之间的缓存
     * 反射去修改变量
     * 自动装箱与拆箱
     */
    private static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {

        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);

        //方法1使用set
        int tempValue1 = a.intValue();//这样子不行，因为tempValue1是存的是引用地址，为什么是引用地址呢？因为int在-128~127之间有缓存，如果swap的值不在这个范围那么就可以
//        Integer tempValue1 = new Integer(a.intValue());
        field.set(a,b.intValue());
        field.set(b,tempValue1);

        //方法2直接使用setInt
        int tempValue2 = a.intValue();
        field.setInt(a,b.intValue());
        field.setInt(b,tempValue2);

    }
}
