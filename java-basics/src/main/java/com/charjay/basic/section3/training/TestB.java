/**
 * 
 */
package com.charjay.basic.section3.training;

/**
 * @author Administrator
 * 
 */
class TestA {
	public void start() {
		System.out.println("TestA");
	}
}

public class TestB extends TestA {
	public void start() {
		System.out.println("TestB");
	}

	public static void main(String[] args) {
		((TestA) new TestB()).start(); // TestA x=new TestB(); x.start();
	}
}
