/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */

//一个接口可以继承多个接口，形成更大规模的复合接口
public interface NormalCollegeStudent extends CollegeStudent, Swimmable {

	 //接口除了可以有public abstract抽象方法之外，还可以有常量。
     //public static final String COLLEGE_NAME="福建师范大学";
	 String COLLEGE_NAME="福建师范大学";

}
