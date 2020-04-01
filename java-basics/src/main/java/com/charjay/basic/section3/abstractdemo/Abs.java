/**
 * 
 */
package com.charjay.basic.section3.abstractdemo;

/**
 * @author Administrator
 * 
 */
//在一个JAVA文件中，可以放置多个JAVA类，但只能有一个是public类，而且文件名必须和public类的类名保持一致。
abstract class Base {
	abstract public void myfunc();

	public void another() {
		System.out.println("Another method");
	}
}

public class Abs extends Base {
	public static void main(String argv[]) {
		Base b = new Abs(); //A
		b.myfunc(); //B
	}

	public void myfunc() {
		System.out.println("My Func");
	}

	public void amethod() {
		myfunc();
	}
}
