/**
 * 
 */
package com.charjay.basic.section3.abstractdemo;

/**
 * @author Administrator
 *
 */

//一个拥有一个或者多个抽象方法的类叫做抽象类。
//一个抽象类是一个残缺的类，其不能创建实例。
//被动抽象类
public abstract class A {
	
	void method1(){
		System.out.println("class A method1 is invoked!");
	}
	
	void method2(){}  //因为方法体的内容为空，所以我们也称之为空实现
	
	abstract void method3(); //没有任何实现，没有方法体，该方法未实现，我们称之为抽象方法。 

}
