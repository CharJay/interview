/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student stu=null;
		
		stu=new Mary();//一个接口引用可以指向实现了这个接口的对象。但只能调用这个对象中的接口部分。
		
		runStudentLife(new Mary());
		runStudentLife(new David());
		runStudentLife(new Tom());

	}
	
	//接口和多态都有利于我们去书写通用的基础代码。
	private static void runStudentLife(Student stu){
		stu.gotoSchool();
		stu.test();
		stu.enjoyHoliday();
	}

}
