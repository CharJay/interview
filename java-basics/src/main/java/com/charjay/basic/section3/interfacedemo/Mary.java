/**
 * 
 */
package com.charjay.basic.section3.interfacedemo;

/**
 * @author Administrator
 *
 */

//Mary类如果想能够被实例化的话，必须要实现Student中规定的三个方法，这带有强制性。
//我们必须implements接口

//一个JAVA类可以实现多个接口，该类必须完全实现这些接口中规定的所有抽象方法。
//一个JAVA类可以继承一个类，实现多个接口；一个接口可以继承多个接口
//一个JAVA类可以实现多个接口，从某种程序也弥补了JAVA单继承的缺点。
public class Mary extends Object implements NormalCollegeStudent,TakingPicture {

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#enjoyHoliday()
	 */
	@Override
	public void enjoyHoliday() {
      System.out.println("mary: 马尔代夫，我来了...");
	}

	/* (non-Javadoc)
	 * @see net.dfrz.interfacedemo.Student#gotoSchool()
	 */
	@Override
	public void gotoSchool() {
      System.out.println("mary: 一般来奔驰来上课.....");
	}

	@Override
	public void test() {
      System.out.println("mary: 东看西看，基本能过....");		
	}

	@Override
	public void cetTest() {
	  System.out.println("mary: 在参看CET4考试，生死难料...");		
	}

	@Override
	public void swim() {
	
	  System.out.println("mary："+NormalCollegeStudent.COLLEGE_NAME+"规定要会游泳才能毕业，我在学习中...");	
		
	}

	@Override
	public void takePhoto() {

		System.out.println("mary：我在拍蝴蝶...");
		
	}


}
