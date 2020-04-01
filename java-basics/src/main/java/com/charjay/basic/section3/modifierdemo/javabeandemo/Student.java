/**
 * 
 */
package com.charjay.basic.section3.modifierdemo.javabeandemo;

/**
 * @author Administrator
 *
 */
public class Student {
	
	private int age;
	
	public void setAge(int age){
		if(age>=12 && age<=18)
			this.age=age;
		else
			this.age=10;
	}
	
	public void showInfo(){
		System.out.println("学生的年龄是"+this.age+"岁!");
	}

}
