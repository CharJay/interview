/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */
public class Tester2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//接口引用变量只能调用这个对象中的接口方法部分。
		Student stu=new Mary();
		Swimmable s=new Mary();
		CollegeStudent cs=new Mary();
		
		TakingPicture tp=new Mary();
		
		
		

	}

}
