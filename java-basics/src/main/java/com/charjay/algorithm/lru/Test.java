package com.charjay.algorithm.lru;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
       test1();
//       test2();
    }

    private static void test1() {
        MyLRUMap<String, Integer> lruMap = new MyLRUMap(3);
        lruMap.put("1", 1);
        lruMap.put("2", 2);
        lruMap.put("3", 3);
        System.out.println(lruMap.toString());
        System.out.println("==============");
        Integer integer = lruMap.get("1");
        System.out.println(integer);
        System.out.println("==============");
        System.out.println(lruMap.toString());
    }

    private static void test2() {
        LRULinkedMap<String,Integer> map = new LRULinkedMap(4) ;
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        for (Map.Entry<String, Integer> e : map.getAll()){
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }
        System.out.println("");
        map.get("1") ;
        map.get("2") ;
        for (Map.Entry<String, Integer> e : map.getAll()){
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }
    }


}
