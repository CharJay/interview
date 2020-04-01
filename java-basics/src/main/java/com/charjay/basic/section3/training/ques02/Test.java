/**
 * 
 */
package com.charjay.basic.section3.training.ques02;

/**
 * @author Administrator
 * 
 */
interface TestA {
	String toString();
}

public class Test {
	public static void main(String[] args) {
		System.out.println(
		   new TestA() {
			 public String toString() {
				return "test";
			 }
		   }
		);
	}
}
