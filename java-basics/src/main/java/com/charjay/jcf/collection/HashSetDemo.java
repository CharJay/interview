/**
 * 
 */
package com.charjay.jcf.collection;

import java.util.HashSet;

/**
 * @author Administrator
 *
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<Integer> intSet=new HashSet<Integer>();
		
		intSet.add(12);
		intSet.add(102);
		intSet.add(33);
		intSet.add(3);
		intSet.add(98);
		intSet.add(3);
		
		//System.out.println(intSet.size());
		
		for(Integer i:intSet)
		  System.out.println(i);

	}

}
