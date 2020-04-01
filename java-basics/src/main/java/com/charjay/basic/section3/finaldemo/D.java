/**
 * 
 */
package com.charjay.basic.section3.finaldemo;

/**
 * @author Administrator
 *
 */
public class D extends C {

//	@Override
//	void doIt() {
//		// TODO Auto-generated method stub
//		super.doIt();
//	}
	
	//final可以修饰方法参数，该方法参数则不能在方法运行过程中被修改，从而起到保护作用。
	void method1(final int m){
	 // m++;	
	}
	
	//final还可以修饰局部变量，该局部变量只能被赋值一次。
	void method2(){
	 
	  final double pi=3.1415926;
	  
	  //pi=2.0;
		
	}
	
	

}
